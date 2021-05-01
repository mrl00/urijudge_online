#include <stdio.h>
#include <stdlib.h>

int main(void) {
  char v[3];
  scanf("%c\n%c\n%c\n", &v[0], &v[1], &v[2]);
  for (int i = 0; i < 3; i++)
    printf("A = %c, B = %c, C = %c\n", v[(i + 0) % 3], v[(i + 1) % 3],
           v[(i + 2) % 3]);

  return EXIT_SUCCESS;
}