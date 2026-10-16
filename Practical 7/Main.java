class Demo {
    Demo() {
        System.out.println("Object created");
    }

    void show() {
        System.out.println("Object is being used");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();

        d = null;
        System.gc();

        System.out.println("Garbage collection requested");
    }
}
