#include<stdio.h>
#include<stdlib.h>

int main(void) {
  int c, n;
  scanf("%d %d", &c, &n);
  printf("%d\n", c % n);
  return EXIT_SUCCESS;
}