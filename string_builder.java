public class string_builder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // find char from index
        System.out.println(sb.charAt(0));

        // change char at any index
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        // insert char at any index
        sb.insert(0, 'n');
        System.out.println(sb);

        // delete char at any index
        sb.delete(2, 3);
        System.out.println(sb);

        // add(append) char
        sb.append('*');
        System.out.println(sb);

        // get lenght
        System.out.println(sb.length());
    }
}
