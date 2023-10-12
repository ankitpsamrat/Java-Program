// create class
class Student {
    int id;
    String name;

    // create method for this class
    public void printInfo() {
        System.out.println(id);
        System.out.println(name);
    }
}

public class class1 {

    public static void main(String[] args) {
        // create object for class
        Student samrat = new Student();
        Student abhay = new Student();

        // assign value using it's object
        samrat.id = 1;
        samrat.name = "Ankit Samrat";
        abhay.id = 2;
        abhay.name = "Abhay Samrat";

        // accessing value using it's object
        // System.out.println(samrat.id);
        // System.out.println(samrat.name);
        // System.out.println(abhay.id);
        // System.out.println(abhay.name);

        // accessing value using method
        samrat.printInfo();
        abhay.printInfo();
    }
}
