class Product {
    String name;
    double price;
    int quantity;

    Product() {
    }

    Product(String name) {
        this.name = name;
        quantity = 1;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 1;
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
        if (name == null) {
            System.out.println("No product details");
        } else {
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + totalCost());
        }
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
