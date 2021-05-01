#include<stdio.h>
#include<stdlib.h>

char cpf(int c, int p, int f) {
  if(c * f > p)
    return 'N';
  return 'S';
}

int main(void) {
  int c, p, f;
  scanf("%d %d %d", &c, &p, &f);
  printf("%c\n", cpf(c,p,f));
  return EXIT_SUCCESS;
}