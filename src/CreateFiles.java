import java.io.File;

public class CreateFiles {
    private static String path = "C:\\Users\\lohye\\Desktop\\FOP Labs\\src\\L10";
    private static int numOfQuestions = 4;

    public static void main(String[] args) {

        for (int i = 1; i <= numOfQuestions; i++) {
            // build up the name of directory to create
            StringBuilder sb = new StringBuilder(path);
            sb.append("\\Q").append(i);

            File f = new File( sb.toString() );
            f.mkdir();
        }
    }
}
