package L9.Q3;

public class Test_Q3 {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("Ali", "Male", "01/01/2020", "lecturer.txt");

        l.display();
        System.out.println();

        l.displayCourses();
    }
}
