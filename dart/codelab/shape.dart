import 'dart:math';

abstract class Shape {
  num get area;
  factory Shape(String type) {
    if (type == 'circle') return Circle(2);
    if (type == 'rectangle') return Square(2);
    throw 'Can\'t create $type';
  }
}

class Circle implements Shape {
  final num radius;
  Circle(this.radius);

  @override
  num get area => pi * pow(radius, 2);
}

class CircleMock implements Circle {
  num area, radius;
}

class Rectangle implements Shape {
  final num base, height;
  Rectangle(this.base, this.height);
  num get area => base * height;
}

class Square extends Rectangle {
  final num side;
  Square(this.side) : super(side, side);
  num get area => pow(side, 2);
}

main(List<String> args) {
  final sq = Square(8);
  final cr = Circle(sqrt(2) / sqrt(pi));
  print(sq.area);
  print(cr.area);
}
