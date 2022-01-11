class student { // create class

    int id;
    String name;

    // public void detail() { // aise method create karke bhi use kr skte h
    // System.out.println(id);
    // System.out.println(name);
    // }
}

public class oop_class {
    public static void main(String[] args) {
        student samrat = new student(); // create object for class
        student abhay = new student();

        samrat.id = 1;
        samrat.name = "Ankit Samrat";
        abhay.id = 2;
        abhay.name = "Abhay Samrat";

        System.out.println(samrat.id);
        System.out.println(samrat.name);
        System.out.println(abhay.id);
        System.out.println(abhay.name);

        // samrat.detail(); // method create krne pr aise likhete h
        // abhay.detail();
    }
}
