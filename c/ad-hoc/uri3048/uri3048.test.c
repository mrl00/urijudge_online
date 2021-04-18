#include<stdio.h>
#include<stdlib.h>

int main(void) {
	int n, counter = 0, *arr = NULL;
	scanf("%d", &n);
	if(n == 1) {
		printf("1\n");
		return 0;
	}
	arr = (int*) calloc(n, sizeof(int));
	for(int i = 0; i < n; i++)
		scanf("%d", arr + i);
	for(int i = 0; i < n; i++) {
			while(arr[i] == arr[i+1]) i++;
		counter++;
	}
	printf("%d\n", counter);
	free(arr), arr = NULL;
	return 0;
}
