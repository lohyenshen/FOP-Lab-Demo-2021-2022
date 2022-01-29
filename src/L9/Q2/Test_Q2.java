package L9.Q2;

public class Test_Q2 {
    public static void main(String[] args) {

        Student a = new Student("Ali", "Male", "01/01/2000", "course.txt");
        a.display();
        a.displayCourseList();
        a.displayGrades();
    }
}
