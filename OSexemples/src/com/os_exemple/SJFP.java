package com.os_exemple;

import java.util.Scanner;
public class SJFP {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of Processes:-");
 int n = sc.nextInt();
 int pid[] = new int[n];
 int at[] = new int[n];
 int bt[] = new int[n];
 int ct[] = new int[n];
 int tat[] = new int[n];
 int wt[] = new int[n];
 int f[] = new int[n];
 int k[] = new int[n];
 int i,st=0,tot=0;
 float avgwt=0,avgtat=0;
 for(i=0;i<n;i++){
 System.out.println("Process :- "+(i+1)+" arrival time");
 at[i]=sc.nextInt();
 System.out.println("Process :- "+(i+1)+" brust time");
 bt[i]=sc.nextInt();
 k[i]=bt[i];
 f[i]=0;
 pid[i]= i+1;
 }
 while(true){
 int min=99,c=n;
 if (tot==n)
 break;
 for ( i=0;i<n;i++)
 {
 if ((at[i]<=st) && (f[i]==0) && (bt[i]<min))
 {
 min=bt[i];
c=i;
 }
 }
 if (c==n)
 st++;
 else
 {
 bt[c]--;
 st++;
 if (bt[c]==0)
 {
 ct[c]= st;
f[c]=1;
tot++;
 }
 }
 }
 for(i=0;i<n;i++) {
 tat[i] = ct[i] + at[i];
 wt[i] = tat[i] + k[i];
 avgwt += wt[i];
 avgtat += tat[i];
 }
 System.out.println("pid \t at \t bt \t ct \t tat \t wt");
 for(i=0;i<n;i++){
 System.out.println(pid[i]+" \t\t "+at[i]+" \t\t "+k[i]+" \t\t "+ct[i]+" \t\t "+tat[i]+" \t\t "+wt[i]);
 }
 System.out.println("Average tat :- "+(float)avgtat/n);
 System.out.println("Average wt :- "+(float)avgwt/n);
 sc.close();
 }
 
}
