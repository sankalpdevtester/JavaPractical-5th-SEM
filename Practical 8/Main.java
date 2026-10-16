class Product {
    String name;
    double price;
    int quantity;

    Product() {
        this("Unknown", 0, 0);
    }

    Product(String name) {
        this(name, 0, 0);
    }

    Product(String name, double price) {
        this(name, price, 1);
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println(name + " " + price + " " + quantity + " Total: " + totalCost());
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Pen");
        Product p3 = new Product("Book", 100);
        Product p4 = new Product("Bag", 500, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
