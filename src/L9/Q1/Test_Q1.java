package L9.Q1;

public class Test_Q1 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Rectangle 1",8,10);
        rectangle.display();
        System.out.println("\n");

        rectangle.input(12,14);
        rectangle.display();
        System.out.println("\n");

        Square square = new Square("Square 1",10);
        square.display();

        System.out.println("\n");

        Circle circle = new Circle("Circle 1",7);
        circle.display();
    }
}
