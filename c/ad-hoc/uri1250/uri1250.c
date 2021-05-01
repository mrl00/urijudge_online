#include <stdio.h>
#include <stdlib.h>

typedef struct {
  int k;
  int *shots;
  char *jumps;
} KiloMan;

KiloMan *km_init(int k) {
  KiloMan *km = (KiloMan *)calloc(1, sizeof(KiloMan));
  km->k = k;
  km->shots = (int *)calloc(k, sizeof(int));
  km->jumps = (char *)calloc(k, sizeof(char));
  return km;
}

void km_destroy(KiloMan *km) {
  free(km->jumps), km->jumps = NULL;
  free(km->shots), km->shots = NULL;
  free(km), km = NULL;
}

int seq_analysis(KiloMan *km) {
  int counter = 0;
  for (int i = 0; i < km->k; i++)
    if ((km->jumps[i] == 'S' && (km->shots[i] == 1 || km->shots[i] == 2)) ||
        (km->jumps[i] == 'J' && km->shots[i] > 2))
      counter++;
  return counter;
}

int main(void) {
  int n, k;
  scanf("%d", &n);

  for (int i = 0; i < n; i++) {
    scanf("%d", &k);
    KiloMan *km = km_init(k);

    for (int j = 0; j < k; j++)
      scanf("%d", km->shots + j);
    scanf("\n");
    for (int j = 0; j < k; j++)
      scanf("%c", km->jumps + j);

    printf("%d\n", seq_analysis(km));

    km_destroy(km);
  }

  return 0;
}
