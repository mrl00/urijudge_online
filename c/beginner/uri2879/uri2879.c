#include<stdio.h>
#include<stdlib.h>

int main(void) {
  int n, d, k = 0;
  scanf("%d", &n);
  
  for(int i = 0; i < n; i++){
    scanf("%d", &d);
    k += d != 1 ? 1 : 0;
  }

  printf("%d\n", k);

  return EXIT_SUCCESS;
}