package L9.Q1;

/**
 * Define a class Shape.
 * The class has a name, perimeter and area.
 * The class has the accessor method and mutator for perimeter and area.
 * Besides, the class also has a display method to display the name of the shape, perimeter and area in two decimal points.
 *
 * Derived a class name Rectangle from Shape.
 * The class has the (extra side length) variables.
 * The class has a method to accept input for both side length and
 *      a method to compute the perimeter and area.
 *
 * Derived another class name Square from Shape.
 * The class has the extra side length variable.
 * The class has a method to accept input for side length and a method to compute the perimeter and area.
 *
 * Derived another class name Circle from Shape.
 * The class has the extra diameter variable.
 * The class has a method to accept input for diameter and a method to compute the perimeter and area.
 *
 * Create a Tester class to test the program
 */
public class Shape {

    protected String name;
    protected double perimeter, area;

    public Shape() {
        this.name = "";
    }

    public Shape(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    public void setPerimeter(double a) {
        this.perimeter = a;
    }

    public void setArea(double a) {
        this.area = a;
    }

    public void display() {
        System.out.printf("%s has perimeter of %.2f and area of %.2f", this.name, this.perimeter, this.area);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                '}';
    }
}
