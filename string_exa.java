public class string_exa {

    // reverse a string

    public static void main(String[] args) {
        String str = "ankit";

        // StringBuilder method
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1.reverse();
        System.out.println(input1);

        // array method
        char[] try1 = str.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);

        // StringBuffer method
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
    }
}
