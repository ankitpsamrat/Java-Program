
class Pen {
    String color;
    String type;

    public void penColor() {
        System.out.println(this.color);
    }

    public void penType() {
        System.out.println(this.type);
    }

}

public class class2 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.type = "Ball";

        p1.penColor();
        p1.penType();
    }
}
