
import java.util.Scanner;

class Shape {
    void calculateArea() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Circle Area: " +
                           (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        System.out.println("Rectangle Area: " +
                           (length * breadth));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("Triangle Area: " +
                           (0.5 * base * height));
    }
}

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Enter base and height: ");
        double base = sc.nextDouble();
        double h = sc.nextDouble();

        Shape s;

        s = new Circle(r);
        s.calculateArea();

        s = new Rectangle(l, b);
        s.calculateArea();

        s = new Triangle(base, h);
        s.calculateArea();

        sc.close();
    }
}
