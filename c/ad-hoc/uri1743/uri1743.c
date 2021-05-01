#include <stdio.h>
#include <stdlib.h>

int sum(int a[5], int b[5]) {
  int k = 0;
  for (int i = 0; i < 5; i++)
    k += (a[i] ^ b[i]);
  return k;
}

char check(int a[5], int b[5]) {
  if (sum(a, b) == 5)
    return 'Y';
  return 'N';
}

int main(void) {
  int p1[5], p2[5];

  for (int i = 0; i < 5; i++)
    scanf("%d", &p1[i]);
  for (int i = 0; i < 5; i++)
    scanf("%d", &p2[i]);

  printf("%c\n", check(p1, p2));

  return EXIT_SUCCESS;
}