long long int fib_iterativo(int n) {
  if(n <= 0)
    return 0;
  long long int k = 1, a = 0, b = 1;
  for(int i = 1; i < n; i++) {
    k = a + b;
    a = b;
    b = k;
  }
  return k;
}

long long int fib_recursivo(int n) {
  if (n <= 1)
    return 1;
  else
    return fib_recursivo(n - 1) + fib_recursivo(n - 2);
}

void multiply(long long int F[2][2], long long int M[2][2]) {
   int a = F[0][0] * M[0][0] + F[0][1] * M[1][0];
   int b = F[0][0] * M[0][1] + F[0][1] * M[1][1];
   int c = F[1][0] * M[0][0] + F[1][1] * M[1][0];
   int d = F[1][0] * M[0][1] + F[1][1] * M[1][1];
   F[0][0] = a;
   F[0][1] = b;
   F[1][0] = c;
   F[1][1] = d;
}

void power(long long int F[2][2], int n) {
   if (n == 0 || n == 1)
      return;
   long long int M[2][2] = {{1,1},{1,0}};
   power(F, n / 2);
   multiply(F, F);
   if (n % 2 != 0)
      multiply(F, M);
}

long long int fib_matrix(int n) {
   long long int F[2][2] = {{1,1},{1,0}};
   if (n <= 0)
      return 0;
   power(F, n - 1);
   return F[0][0];
}
