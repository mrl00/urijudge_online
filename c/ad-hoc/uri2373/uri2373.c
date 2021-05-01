#include<stdio.h>
#include<stdlib.h>

int lc(int l, int c) {
  if(l > c)
    return c;
  return 0;
}

int main(void) {
  int n, l, c, k = 0;
  scanf("%d", &n);
  
  for(int i = 0; i < n; i++) {
    scanf("%d %d", &l, &c);
    k += lc(l, c);
  }
  
  printf("%d\n", k);

  return EXIT_SUCCESS;
}