package estruturasebibliotecas.uri1022;

import java.util.ArrayList;
import java.util.List;

interface Op {
  int execute();
}

abstract class Operations implements Op {
  int mdc(int x, int y) {
    if (x % y == 0)
      return y;
    else
      return mdc(y, x % y);
  }

  @Override
  public String toString() {
    return "";
  }
}

class Sum extends Operations {

  @Override
  public int execute() {
    return 0;
  }

}

class InputObject {
  private List<Integer> numbers;
  private String op;

  InputObject(String input) {
    this.numbers = new ArrayList<>();
    this.op = input.charAt(6) + "";
    StringBuilder aux = new StringBuilder(input);
    String str[] = aux.deleteCharAt(10).deleteCharAt(6).deleteCharAt(2).toString().split("\\s+");
    for (String s : str)
      numbers.add(Integer.parseInt(s));
  }

  public int getN1() {
    return numbers.get(0);
  }

  public int getD1() {
    return numbers.get(1);
  }

  public String getOp() {
    return this.op;
  }

  public int getN2() {
    return numbers.get(2);
  }

  public int getD2() {
    return numbers.get(3);
  }
}

public class Main {
  public static void main(String[] args) {

    InputObject iObject = new InputObject("1 / 2 + 3 / 4");
    System.out.println(iObject.getN1());
    System.out.println(iObject.getD1());
    System.out.println(iObject.getOp());
    System.out.println(iObject.getN2());
    System.out.println(iObject.getD2());
  }
}