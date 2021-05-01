#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct {
  int a, b;
} Maq;

Maq *maq_init(int a, int b) {
  Maq *maq = (Maq *)calloc(1, sizeof(Maq));
  maq->a = a, maq->b = b;
  return maq;
}

bool between(Maq *maq, int k) { return (k >= maq->a && k <= maq->b); }
bool valid(Maq *l, Maq *s, int k) { return between(l, k) && between(s, k); }
char *ans(Maq *l, Maq *s, int k) {
  return valid(l, s, k) ? "possivel" : "impossivel";
}

int main(void) {
  int n, a, b, c, d;
  scanf("%d\n%d %d\n%d %d", &n, &a, &b, &c, &d);
  Maq *l = maq_init(a, b), *s = maq_init(c, d);
  printf("%s\n", ans(l, s, n));
  return EXIT_SUCCESS;
}