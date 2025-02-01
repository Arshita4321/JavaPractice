class Shape {
    public double calculatedArea() {
        return 0;
    }

    public void displayShape(){
        System.out.println("This is a shape.");;
    }
    public void draw(){
        System.out.println("Drawing a shape.");
    }
}



class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculatedArea(){
        return Math.PI * radius * radius;
    }

    public void draw(){
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Question11 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        circle.displayShape();
        circle.draw();
        System.out.printf("Area of Circle: %.1f\n" ,circle.calculatedArea());

        Rectangle rectangle = new Rectangle(5, 10);

        rectangle.displayShape();
        rectangle.draw();
        System.out.println("Area of Rectangle: "+ rectangle.calculateArea());
    }
    
}
