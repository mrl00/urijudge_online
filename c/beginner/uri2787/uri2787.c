#include <stdio.h>
#include <stdlib.h>

int xadrez(int n, int k) {
  if (n % 2 == 0) {
    if (k % 2 == 0)
      return 1;
    else
      return 0;
  } else
    return !xadrez(n + 1, k);
}

int main(void) {
  int n, k;
  scanf("%d\n%d\n", &n, &k);
  printf("%d\n", xadrez(n, k));
  return EXIT_SUCCESS;
}