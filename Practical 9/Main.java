class Employee {
    String name;
    double salary;
    static int count = 0;

    Employee() {
        this("X", 0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println(name + " " + salary);
    }

    static void showCount() {
        System.out.println("Total employees: " + count);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Y", 25000);
        Employee e3 = new Employee("Z", 30000);

        e1.display();
        e2.display();
        e3.display();

        showCount();
    }
}
