#include<stdio.h>
#include<stdlib.h>

typedef struct {
  int pv, pe, s, total;
} Team;

Team time_init(int ves[3]) {
  Team team;
  team.pv = ves[0] * 3;
  team.pe = ves[1];
  team.s  = ves[2];
  team.total = team.pv + team.pe;
  return team;
}

char team_compare(Team c, Team f) {
  if(c.total > f.total)
    return 'C';
  else if(c.total < f.total)
    return 'F';
  else {
    if(c.s > f.s)
      return 'C';
    else if(c.s < f.s)
      return 'F';
    else
      return '=';
  }
}

int main(void) {
  int c[3], f[3];
  scanf("%d %d %d %d %d %d", &c[0], &c[1], &c[2], &f[0], &f[1], &f[2]);
  Team cormengo = time_init(c), flaminthians = time_init(f);
  printf("%c\n", team_compare(cormengo, flaminthians));
  return 0;
}