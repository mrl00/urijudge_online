#include <stdio.h>
#include <stdlib.h>

int nota(int a, int m) { return 2 * m - a; }

int main(void) {
  int a, m;
  scanf("%d\n%d", &a, &m);
  printf("%d\n", nota(a, m));
  return EXIT_SUCCESS;
}