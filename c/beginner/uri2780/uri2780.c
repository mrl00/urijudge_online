#include<stdio.h>
#include<stdlib.h>

int br(int n) {
  if(n <= 800)
    return 1;
  if(n > 800 && n <= 1400)
    return 2;
  if(n > 1400 && n <= 2000)
    return 3;
  return 0;
}

int main(void) {
  int n;
  scanf("%d", &n);
  printf("%d\n", br(n));
  return EXIT_SUCCESS;
}