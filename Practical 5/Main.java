class ComplexNumber {
    int real, imaginary;
 ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }
  ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(real + c.real,
                                 imaginary + c.imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}
public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(2, 5);

        System.out.print("First number: ");
        c1.display();

        System.out.print("Second number: ");
        c2.display();

        ComplexNumber sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();
    }
}
