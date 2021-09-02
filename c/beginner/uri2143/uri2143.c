#include<stdio.h>
#include<stdlib.h>

int g(int n) {
	if(n % 2 == 0)
		return (n - 2)*2 + 2;
	return 2*n - 1;
}

int main(void) {
	int n = 1;
	
	while(1) {
		int v;
		scanf("%d", &n);
		if(n == 0) break;
		for(int i = 0; i < n; i++) {
			scanf("%d", &v);
			printf("%d\n", g(v));
		}
	}

	return EXIT_SUCCESS;
}
