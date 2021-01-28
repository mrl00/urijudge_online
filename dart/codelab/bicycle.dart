class Bicycle {
  int cadence, gear;
  
  int _speed = 0;
  int get speed => _speed;

  Bicycle(this.cadence, this._speed, this.gear) ;
  
  void applyBreak(int decrement) {
    _speed -= decrement;
  }

  void speedUp(int increment) {
    _speed += increment;
  }
  
  @override
  String toString() {
    String s1 = "Cadence:\t${this.cadence}\n";
    String s2 = "Speed:\t\t${this._speed}\n";
    String s3 = "Gear:\t\t${this.gear}\n";
    return s1 + s2 + s3;
  }
}

void main(List<String> args) {
  var bike = new Bicycle(2, 0, 1);
  print(bike);
}
