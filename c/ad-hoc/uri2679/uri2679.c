#include<stdio.h>
#include<stdlib.h>

int min_next_even(int n) {
  if(n % 2 == 0)
    return n + 2;
  return n + 1;
}

int main(void) {
  int n;
  scanf("%d", &n);
  printf("%d\n", min_next_even(n));
  return EXIT_SUCCESS;
}