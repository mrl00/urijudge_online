#include<stdio.h>
#include<stdlib.h>

int peso(int a, int b, int c, int d) {
  int x = a *b, y = c * d;
  if(x > y)
    return -1;
  else if(x < y)
    return 1;
  else
    return 0;
}

int main(void) {
  int p1, c1, p2, c2;
  scanf("%d %d %d %d", &p1, &c1, &p2, &c2);
  
  printf("%d\n", peso(p1, c1, p2, c2));

  return EXIT_SUCCESS;
}