#include<stdio.h>
#include<stdlib.h>

int oferta(int n, int k) {
  return (n % k + n / k);
}

int main(void) {
  int t, n, k;
  scanf("%d", &t);
  for(int i = 0; i < t; i++) {
    scanf("%d %d", &n, &k);
    printf("%d\n", oferta(n, k));
  }
  return EXIT_SUCCESS;
}