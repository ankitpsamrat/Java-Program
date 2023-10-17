class Shape {
    String color;
}

class Triangle extends Shape {
    int shapeCount;
}

public class inheritance_exa {

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.shapeCount = 3;
        obj.color = "red";
    }
}
