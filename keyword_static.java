class Member {
    static int no;

    static void title() {
        System.out.println("Member");
    }
}

public class keyword_static {

    public static void main(String[] args) {
        // static value can be access using class name without creating object

        Member.no = 20;
        System.out.println(Member.no);
        Member.title();
    }
}
