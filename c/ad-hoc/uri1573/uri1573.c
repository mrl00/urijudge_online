#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int a, b, c;
  while (1) {
    scanf("%d %d %d", &a, &b, &c);
    if (a == 0 && b == 0 && c == 0)
      break;
    printf("%d\n", (int)cbrtf((float)a * b * c));
  }
  return EXIT_SUCCESS;
}