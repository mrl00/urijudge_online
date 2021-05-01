#include<stdio.h>
#include<stdlib.h>
#include<math.h>

double pas_tri(int n) {
  double k = 0;
  for(int i = 0; i < n; i++)
    k += pow(2, i);
  return k;
}

int main(void) {
  int n;
  double k;

  scanf("%d", &n);
  for(int i = 0; i < n; i++) {
    int d;
    scanf("%d", &d);
    printf("%.0lf\n", pas_tri(d));
  }

  return 0;
}