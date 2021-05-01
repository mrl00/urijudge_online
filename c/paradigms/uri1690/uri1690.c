#include <stdio.h>
#include <stdlib.h>

typedef struct {
  int n, *p;
} Problem;

int int_cmp(const void *a, const void *b) {
  const int *ia = (const int *)a;
  const int *ib = (const int *)b;
  return (*ia) - (*ib);
}

Problem *init_problem(void) {
  Problem *problem = (Problem *)calloc(1, sizeof(Problem));
  scanf("%d", &problem->n);
  problem->p = (int *)calloc(problem->n, sizeof(int));
  for (int i = 0; i < problem->n; i++)
    scanf("%d", problem->p + i);
  qsort(problem->p, problem->n, sizeof(int), int_cmp);
  return problem;
}

void destroy_problem(Problem *problem) {
  free(problem->p), problem->p = NULL;
  free(problem);
}

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

void show_int_array(int *arr, int n) {
  for (int i = 0; i < n; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

int main(void) {
  int t;
  scanf("%d", &t);

  for (int i = 0; i < t; i++) {
    Problem *problem = init_problem();
    printf("%d | ", problem->n);
    show_int_array(problem->p, problem->n);

    int c = *problem->p;
    while (subset_sum_d(problem->p, problem->n, c++)){}
    destroy_problem(problem);
    printf("%d\n", c);
  }

  return EXIT_SUCCESS;
}