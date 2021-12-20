import java.io.File;
import java.util.Scanner;

public class delete_file {
    public static void main(String[] args) { // delete any java file
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name with extention : ");
        String a = sc.nextLine();
        File file = new File(a);
        boolean value = file.delete();
        if (value) {
            System.out.println(a + " is successfully deleted");
        } else {
            System.out.println("File doesn't exit");
        }
        sc.close();
    }
}
