class Book {
    String title, author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 500);
        Book b3 = new Book(b2);

        b1.display();
        b2.display();
        b3.display();

        b3.price = 700;

        b2.display();
        b3.display();
    }
}
