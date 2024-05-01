package com.os_exemple;

import java.util.*;

public class RoundRobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, quantum;
        System.out.print("Enter the number of processes: ");
        n = sc.nextInt();
        System.out.print("Enter the time quantum: ");
        quantum = sc.nextInt();
        int[] burstTime = new int[n];
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];
        int[] remainingTime = new int[n];
        System.out.println("Enter the burst time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + ": ");
            burstTime[i] = sc.nextInt();
            remainingTime[i] = burstTime[i];
        }
        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        while (true) {
            boolean done = true;
            for (int i = 0; i < n; i++) {
                if (remainingTime[i] > 0) {
                    done = false;
                    if (remainingTime[i] > quantum) {
                        time += quantum;
                        remainingTime[i] -= quantum;
                    } else {
                        time += remainingTime[i];
                        waitingTime[i] = time - burstTime[i] - totalWaitingTime;
                        totalWaitingTime += waitingTime[i];
                        remainingTime[i] = 0;
                        turnaroundTime[i] = time - burstTime[i];
                        totalTurnaroundTime += turnaroundTime[i];
                    }
                }
            }
            if (done == true)
                break;
        }
        System.out.println("Process\tBurst Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t\t" + burstTime[i] + "\t\t" + waitingTime[i] + "\t\t" + turnaroundTime[i]);
        }
        double avgWaitingTime = (double) totalWaitingTime / n;
        double avgTurnaroundTime = (double) totalTurnaroundTime / n;
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
        sc.close();
    }
}