// polymorphism means having many forms. we can define polymorphism
// as the ability of a message to be displayed in more than one form.

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class polymorphism {

    public static void main(String args[]) {
        Bank b = new Bank();

        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());

        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());

        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}