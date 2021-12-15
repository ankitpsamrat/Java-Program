import java.util.Scanner;

public class vowel_search {
    public static void main(String[] arg) { // using switch case
        String s;
        char ch;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        s = sc.nextLine();
        System.out.print("Vowels is : ");
        for (int j = 0; j < s.length(); j++) {
            ch = s.charAt(j);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    i = 1;
                    System.out.print(" " + ch);
            }
        }
        if (i == 0) {
            System.out.println("There are no vowels in a string");
        }
        sc.close();
    }
}
