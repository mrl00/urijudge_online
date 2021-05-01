#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int n, a, b;
  scanf("%d", &n);

  for (int i = 0; i < n; i++) {
    scanf("%d %d\n", &a, &b);
    int x = ceil((a - 2) / 3.0), y = ceil((b - 2) / 3.0);
    printf("%d\n", x * y);
  }
  return EXIT_SUCCESS;
}