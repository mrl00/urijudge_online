#include<stdio.h>
#include<stdlib.h>

int maximum(int *arr) {
  int k = -1;
  for(int *i = arr; (*i) != 0; i++)
    if((*i) > k) 
      k = (*i);
  return k;
}

int main(void) {
  int n = 0, r = -1, *arr = (int*) calloc(1000, sizeof(int));

  while(1) {
    scanf("%d", &r);
    if(r == 0) 
      break;
    arr[n++] = r;
  }

  printf("%d\n", maximum(arr));
  free(arr), arr = NULL;
  return EXIT_SUCCESS;
}