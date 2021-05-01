#include<stdio.h>
#include<stdlib.h>

int main(void) {
  int a, n, k = 0, t;
  scanf("%d\n%d", &a, &n);

  for(int i = 0; i < n; i++){
    scanf("%d", &t);
    k += a*t >= 40000000 ? 1 : 0;
  }

  printf("%d\n", k);
  return 0;
}