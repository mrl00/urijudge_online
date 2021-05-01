#include<stdio.h>
#include<stdlib.h>

char dest(int p, int r) {
  if(r == 0 && p == 0)
    return 'C';
  if(r == 0 && p == 1)
    return 'B';
  if(r == 1 && p == 0)
    return 'C';
  if(r == 1 && r == 1)
    return 'A';
  return 'Z';
}

int main(void) {
  int p, r;

  scanf("%d %d", &p, &r);
  printf("%c\n", dest(p, r));

  return EXIT_SUCCESS;
}