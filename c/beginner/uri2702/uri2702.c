#include<stdio.h>
#include<stdlib.h>

int main(void) {
  int a[3], x[3], k = 0;
  scanf("%d %d %d\n%d %d %d", &a[0], &a[1], &a[2], &x[0], &x[1], &x[2]);

  for(int i = 0; i < 3; i++)
    k += (x[i] - a[i]) >= 0 ? (x[i] - a[i]) : 0;

  printf("%d\n", k);

  return EXIT_SUCCESS;
}