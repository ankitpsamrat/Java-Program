public class string_method {

    public static void main(String[] args) {

        // toLowerCase method
        String a = "SAMRAT";
        System.out.println(a.toLowerCase());

        // toUpperCase method
        String b = "samrat";
        System.out.println(b.toUpperCase());

        // length method
        System.out.println(b.length());

        // isEmpty method
        System.out.println(b.isEmpty());

        // trim method
        String c = "  samrat   ";
        System.out.println(c.trim());

        // charAt method
        System.out.println(c.charAt(2));

        // indexOf method
        System.out.println(c.indexOf("m"));

        // concat method
        System.out.println(a.concat(c));
    }
}
