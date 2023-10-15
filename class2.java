class Pen {
    String color;
    int price;

    public void penDetails() {
        System.out.println(color);
        System.out.println(price);

        // aise bhi likh skte h
        // System.out.println(this.color);
        // System.out.println(this.price);
    }
}

public class class2 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.price = 2;

        p1.penDetails();
    }
}
