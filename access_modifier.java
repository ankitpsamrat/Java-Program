class c1 { // create class

    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void meth1() { // create method
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class access_modifier {
    public static void main(String[] args) {
        c1 obj = new c1(); // create object for class
        obj.meth1();
    }
}
