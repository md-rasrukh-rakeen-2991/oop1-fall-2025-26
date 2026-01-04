// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
    
    // Concrete method to display shape
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implement abstract method
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    // Override displayShape for specificity (optional)
    @Override
    public void displayShape() {
        System.out.println("This is a rectangle.");
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Implement abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Override displayShape for specificity (optional)
    @Override
    public void displayShape() {
        System.out.println("This is a circle.");
    }
}

// Demonstration class
public class ShapeDemo {
    public static void main(String[] args) {
        // Create a Rectangle object
        Shape rectangle = new Rectangle(7.0, 4.0);
        rectangle.displayShape();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        
        // Create a Circle object
        Shape circle = new Circle(6.0);
        circle.displayShape();
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}