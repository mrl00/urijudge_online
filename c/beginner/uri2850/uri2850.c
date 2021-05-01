#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *saida(char *papagaio) {
  if (!strcmp(papagaio, "esquerda"))
    return "ingles";
  if (!strcmp(papagaio, "direita"))
    return "frances";
  if (!strcmp(papagaio, "nenhuma"))
    return "portugues";
  if (!strcmp(papagaio, "as duas"))
    return "caiu";
  return "";
}

int main(void) {
  char *papagaio = (char *)calloc(9, sizeof(char));

  while (scanf("%[^\n]\n", papagaio) == 1)
    printf("%s\n", saida(papagaio));

  return EXIT_SUCCESS;
}