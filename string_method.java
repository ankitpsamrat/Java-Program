public class string_method {

    public static void main(String[] args) {
        String a = "sAmrAT";

        // toLowerCase method
        System.out.println(a.toLowerCase());

        // toUpperCase method
        System.out.println(a.toUpperCase());

        // length method
        System.out.println(a.length());

        // isEmpty method
        System.out.println(a.isEmpty());

        // trim method
        String c = " samrat ";
        System.out.println(c.trim());

        // startsWith method
        System.out.println(a.startsWith("s"));

        // endsWith method
        System.out.println(a.endsWith("t"));

        // equals method
        System.out.println(a.equals(c));

        // charAt method
        System.out.println(a.charAt(2));

        // indexOf method
        System.out.println(a.indexOf("m"));

        // concat method
        System.out.println(a.concat(c));

        // contains method
        System.out.println(a.contains("A"));

        // split method
        String fullName = "Ankit Pratap Samrat";
        for (String value : fullName.split(" ")) {
            System.out.println(value);
        }
    }
}
