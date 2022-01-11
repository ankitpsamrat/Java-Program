interface inter { // create class

    void print();
}

class samrat implements inter { // create inherit class
    public void print() {
        System.out.println("Interface example");
    }
}

public class interface_program {
    public static void main(String[] args) {
        samrat obj = new samrat(); // create object for inherit class
        obj.print();
    }
}
