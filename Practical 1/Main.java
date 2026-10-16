class Student {
    int rollNo;
    String name;
    int m1,m2,m3;
    Student(int rollNo, String name,int m1,int m2,int m3) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    int total(){
        return m1+m2+m3;
    }
    double percentage(){
        return total()/3.0;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total());
        System.out.println("Percentage: " + percentage() + "%");
        System.out.println();
    }
}
class Main  {
    public static void main(String[] args){
        Student s1= new Student(1, "X", 90, 83, 91);
        Student s2= new Student(2, "Y", 75, 88, 82);
        Student s3= new Student(3, "Z", 95, 92, 86);

        s1.display();
        s2.display();
        s3.display();
    }
}

