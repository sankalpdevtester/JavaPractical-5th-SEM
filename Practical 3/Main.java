public class Main
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.display();
        c.show();
    }
}

class Vehicle
{
    String brand = "X";
    void display()
    {
        System.out.println("Brand: " + brand);
        System.out.println("A Vehicle");
    }
}

class Car extends Vehicle
{
    String model = "Y";
    void show()
    {
        System.out.println("Model: " + model);
    }
}
