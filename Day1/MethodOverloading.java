class Calculator {

  // 1. Add two integers
  int add(int a, int b) {
    return a + b;
  }

  // 2. Add three integers
  int add(int a, int b, int c) {
    return a + b + c;
  }

  // 3. Add two doubles
  double add(double a, double b) {
    return a + b;
  }

  // 4. Add a string and integer
  String add(String a, int b) {
    return a + b;
  }
}

public class MethodOverloading {
  public static void main(String[] args) {
    Calculator cal = new Calculator();

    System.out.println("Sum of 2 integers: " + cal.add(5, 10));
    System.out.println("Sum of 3 integers: " + cal.add(5, 10, 15));
    System.out.println("Sum of 2 doubles: " + cal.add(3.5, 4.5));
    System.out.println("String and int: " + cal.add("Total: ", 100));
  }
}
