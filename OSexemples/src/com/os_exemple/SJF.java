package com.os_exemple;

import java.util.*;

public class SJF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();
        int[] BT = new int[n];
        int[] AT = new int[n];
        for(int i = 0; i < n; i++) {
       
            System.out.print("Enter the burst time for process " + (i+1) + ": ");
            BT[i] = sc.nextInt();
            System.out.print("Enter the arrival time for process " + (i+1) + ": ");
            AT[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(AT[i] > AT[j]) {
                
                    int temp = AT[i];
                    AT[i] = AT[j];
                    AT[j] = temp;
                  
                    temp = BT[i];
                    BT[i] = BT[j];
                    BT[j] = temp;
                   
                } else if (AT[i] == AT[j] && BT[i] > BT[j]) {
                   
                    int temp = AT[i];
                    AT[i] = AT[j];
                    AT[j] = temp;

                    temp = BT[i];
                    BT[i] = BT[j];
                    BT[j] = temp; 
                }
            }
        }
        int[] WT = new int[n];
        int[] TAT = new int[n];
        WT[0] = 0;
        for(int i = 1; i < n; i++) {
            WT[i] = WT[i-1] + BT[i-1];
            
        }
        for(int i = 0; i < n; i++) {
            TAT[i] = WT[i] + BT[i];
        }
      //  double AvgWT = Arrays.stream(WT).average().getAsDouble();
     //   double AvgTAT = Arrays.stream(TAT).average().getAsDouble();
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
        
        System.out.println("Process ID\tBurst Time\tArrival Time\tWaiting Time\tTurnaround Time");
        for(int i = 0; i < n;i++) {
        	 System.out.println((i+1) + "\t\t" + BT[i] + "\t\t" + AT[i] + "\t\t" + WT[i] + "\t\t" + TAT[i]);
        	 }
        System.out.println("Average turn around time is: "+ AvgTAT);
        System.out.println("Average waiting time is: "+ AvgWT);

        sc.close();
    }
}

