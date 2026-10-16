class Calculator {
    int add(int a, int b) {
        return a + b;
    }
  int add(int a, int b, int c) {
        return a + b + c;
    }
  double add(double a, double b) {
        return a + b;
    }
}
class Employee {
    double calculatePay() {
        return 0;
    }
}
class FullTime extends Employee {
    double calculatePay() {
        return 30000;
    }
}
class PartTime extends Employee {
    double calculatePay() {
        return 15000;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of 2 numbers: " + c.add(10, 20));
        System.out.println("Sum of 3 numbers: " + c.add(10, 20, 30));
        System.out.println("Sum of decimals: " + c.add(2.5, 3.5));
    Employee e;
e = new FullTime();
        System.out.println("Full-time pay: " + e.calculatePay());
e = new PartTime();
        System.out.println("Part-time pay: " + e.calculatePay());
    }
}
