#include <stdio.h>
#include <stdlib.h>

// int subset_sum_r(int *p, int n, int c) {
//   if (n == 0) {
//     if (c == 0)
//       return 1;
//     return 0;
//   }
//   int b = subset_sum_r(p, n - 1, c);
//   if (b == 0 && p[n] <= c)
//     b = subset_sum_r(p, n - 1, c - p[n]);
//   return b;
// }

int subset_sum_d(int *p, int n, int c) {
  int t[n + 1][c + 1];

  for (int i = 0; i <= n; i++)
    t[i][0] = 1;

  for (int i = 1; i <= c; i++) {
    t[0][i] = 0;
    for (int j = 1; j <= n; j++) {
      int b = t[j - 1][i];
      if (b == 0 && p[j] <= i)
        b = t[j - 1][i - p[j]];
      t[j][i] = b;
    }
  }
  return t[n][c];
}

int subset_sum_d2(int *p, int n, int c) {
  int t[n + 1][c + 1];

  for (int i = 0; i <= n; i++)
    t[i][0] = 1;

  for (int j = 1; j <= c; j++) {
    t[0][j] = 0;
    for (int i = 1; i <= n; i++) {
      if (p[i] > j)
        t[i][j] = t[i - 1][j];
      else
        t[i][j] = t[i - 1][j] || t[i - 1][j - p[i]];
    }
  }

  return t[n][c];
}
#define repeat(p,n) for(int i = 1; i <= 10; i++) \
												printf("%d - %d\n", i, subset_sum_d(p, n, i))

int main(void) {
  int p[] = {2, 1, 5};
  int t[] = {4, 2, 5, 3};
  // printf("%d\n", subset_sum_r(p, 3, 4));

  repeat(p,3);
	repeat(t,3);
  
  return EXIT_SUCCESS;
}
