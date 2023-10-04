import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4.0);
        Rectangle rectangle = new Rectangle(5.0,3.0);

        System.out.println("Circle area is "+circle.calculateArea());
        System.out.println("Circle perimeter is "+circle.calculatePerimeter());

        System.out.println("--------------------------------------------------");

        System.out.println("Rectangle area is "+rectangle.calculateArea());
        System.out.println("Rectangle perimeter is "+rectangle.calculatePerimeter());


    }
}