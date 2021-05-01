#include<stdio.h>
#include<stdlib.h>

int main(void) {
  int beans[4];
  scanf("%d %d %d %d", &beans[0], &beans[1], &beans[2], &beans[3]);
  for(int i = 0; i < 4; i++){
    if(beans[i] == 1) {
      printf("%d\n", i + 1);
      break;
    }
  }
  return EXIT_SUCCESS;
}