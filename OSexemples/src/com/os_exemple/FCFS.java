package com.os_exemple;

import java.util.*;

public class FCFS {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of processes: ");
        int n = input.nextInt();
        
        int[] BT = new int[n];
        int[] AT = new int[n];
        int[] WT = new int[n];
        int[] TAT = new int[n];
        
        System.out.println("Enter the burst time for each process: ");
        for(int i=0; i<n; i++) {
            BT[i] = input.nextInt();
        }
        
        System.out.println("Enter the arrival time for each process: ");
        for(int i=0; i<n; i++) {
            AT[i] = input.nextInt();
        }
        
        WT[0] = 0;

        for(int i=1; i<n; i++) {
            int waiting = 0;
            for(int j=0; j<i; j++) {
                waiting = waiting + BT[j];
                if(AT[j] > AT[i]) {
                    waiting = waiting + AT[j] - AT[i];
                }
            }
            WT[i] = waiting;
        }

        for(int i=0; i<n; i++) {
            TAT[i] = WT[i] + BT[i];
        }
        System.out.println("Process\tBurst Time\tArrival Time\tWaiting Time\tTurn Around Time");
        for(int i=0; i<n; i++) {
            System.out.println((i+1) + "\t\t" + BT[i] + "\t\t" + AT[i] + "\t\t" + WT[i] + "\t\t" + TAT[i]);
        }
        double AvgTAT =0;
        double AvgWT =0;
        double sum1 = 0;
        double sum2 = 0;
        for(int i=0;i<n;i++) {
        	sum1 = sum1 + TAT[i];
        }
        for(int i=0;i<n;i++) {
        	sum2 = sum2 + WT[i];
        }
        AvgTAT = sum1/n;
        AvgWT = sum2/n;
        System.out.println("\nAverage Turn Around Time is: "+ AvgTAT);
        System.out.println("\nAverage Waiting Time Time is: "+ AvgWT);
        input.close();
    }
}
