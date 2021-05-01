#include <stdio.h>
#include <stdlib.h>

int toll(int l, int d, int k, int p) { return p * (l / d) + k * l; }

int main(void) {
  int a, s, d, f;
  scanf("%d %d\n%d %d", &a, &s, &d, &f);
  printf("%d\n", toll(a, s, d, f));
  return EXIT_SUCCESS;
}
