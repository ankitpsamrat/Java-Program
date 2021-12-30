import java.util.Scanner;

public class count_character {
    public static void main(String[] args) { // count character of any string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String string = sc.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Total characters : " + count);
        sc.close();
    }
}