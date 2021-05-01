#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int cstring_cmp(const void *a, const void *b) {
  const char **ia = (const char **)a;
  const char **ib = (const char **)b;
  return strcmp(*ia, *ib);
}

// void print_cstring_array(char **array, size_t len) {
//   size_t i;

//   for (i = 0; i < len; i++)
//     printf("%s | ", array[i]);

//   putchar('\n');
// }

int main(void) {
  int n, k;
  scanf("%d %d\n", &n, &k);

  char **names = (char **)calloc(n, sizeof(char *));

  for (int i = 0; i < n; i++) {
    *(names + i) = (char *)calloc(21, sizeof(char));
    scanf("%[^\n]\n", *(names + i));
  }

  qsort(names, n, sizeof(char *), cstring_cmp);
  // print_cstring_array(names, n);
  printf("%s\n", names[k - 1]);

  return EXIT_SUCCESS;
}