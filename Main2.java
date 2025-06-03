// Base class
abstract class Shape {
    abstract double area();
}

// Derived class Circle
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Main class to demonstrate dynamic binding
public class Main2 {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + shape1.area());
        System.out.println("Area of Rectangle: " + shape2.area());
    }
}
