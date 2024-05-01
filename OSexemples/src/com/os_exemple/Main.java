#include <stdio.h>

#define MAX 100

int main() {
  int n, i, j, time, quantum, remaining;
  int wt[MAX], tat[MAX], at[MAX], bt[MAX];

  printf("Enter the number of processes: ");
  scanf("%d", &n);

  remaining = n;

  for (i = 0; i < n; i++) {
    printf("Enter arrival time and burst time for process %d: ", i + 1);
    scanf("%d %d", &at[i], &bt[i]);
    wt[i] = 0;
    tat[i] = 0;
  }

  printf("Enter time quantum: ");
  scanf("%d", &quantum);

  time = 0;
  i = 0;

  while (remaining != 0) {
    if (bt[i] <= quantum && bt[i] > 0) {
      time += bt[i];
      bt[i] = 0;
      tat[i] = time - at[i];
      wt[i] = tat[i] - bt[i];
      remaining--;
    } else if (bt[i] > 0) {
      bt[i] -= quantum;
      time += quantum;
    }

    if (i == n - 1) {
      i = 0;
    } else if (at[i + 1] <= time) {
      i++;
    } else {
      i = 0;
    }
  }

  printf("Process\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time\n");

  for (i = 0; i < n; i++) {
    printf("%d\t%d\t\t%d\t\t%d\t\t%d\n", i + 1, at[i], bt[i], wt[i], tat[i]);
  }

  return 0;
}