import 'dart:svg';

String scream(int n) => 'A${'a' * n}h!';

main(List<String> args) {
  final values = [1,2,3,4,5];
  values.map(scream).forEach(print);
  print('\n');
  values.takeWhile((value) => value < 3).map(scream).forEach(print);
  print(values.fold(0, (previousValue, element) => element.isEven));
}




