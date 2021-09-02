#include<stdio.h>
#include<stdlib.h>

int main(void) {
  unsigned long a, b;
  while(scanf("%lu %lu\n", &a, &b) >= 0)
    printf("%lu\n", a ^ b);
  return EXIT_SUCCESS;
}