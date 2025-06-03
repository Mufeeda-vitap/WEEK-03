// create a class shape with a method display(). override the method in both circle and rectangle classes . use the super keyword to the overriden methods to call the parent class display() method before printing shape specific messages . write a main function to show how super works 
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void display() {
        super.display(); // Calls the display method of Shape
        System.out.println("This is a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void display() {
        super.display(); // Calls the display method of Shape
        System.out.println("This is a rectangle.");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.display();
        rectangle.display();
    }
}
