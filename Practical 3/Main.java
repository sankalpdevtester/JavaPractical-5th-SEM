interface Printable {
    void print();
}
interface Scannable {
    void scan();
}
class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}
class Machine {
    void start() {
        System.out.println("Machine started.");
    }
}

class Printer extends Machine implements Printable, Scannable {
    public void print() {
        System.out.println("Printer is printing.");
    }

    public void scan() {
        System.out.println("Printer is scanning.");
    }
}
public class Main {
    public static void main(String[] args) {
        AllInOnePrinter a = new AllInOnePrinter();
        a.print();
        a.scan();

        Printer p = new Printer();
        p.start();
        p.print();
        p.scan();
    }
}
