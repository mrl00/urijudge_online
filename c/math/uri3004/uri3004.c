#include <stdio.h>
#include <stdlib.h>

typedef struct {
  int x, y;
} Mail;

Mail *init_mail(int x, int y) {
  Mail *mail = (Mail *)calloc(1, sizeof(Mail));
  mail->x = x;
  mail->y = y;
  return mail;
}

void swap(Mail *mail) {
  int aux = mail->x;
  mail->x = mail->y;
  mail->y = aux;
}

void fix_mail(Mail *mail) {
  if (mail->x > mail->y)
    swap(mail);
}

char compare(Mail *a, Mail *b) {
  fix_mail(a), fix_mail(b);
  if (a->x < b->x && a->y < b->y)
    return 'S';
  return 'N';
}

int main(void) {
  Mail *m = NULL, *n = NULL;
  int k, a, b, c, d;
  scanf("%d\n", &k);
  while (k--) {
    scanf("%d %d %d %d", &a, &b, &c, &d);
    m = init_mail(a, b);
    n = init_mail(c, d);
    printf("%c\n", compare(m, n));

    free(m), m = NULL;
    free(n), n = NULL;
  }
  return EXIT_SUCCESS;
}
