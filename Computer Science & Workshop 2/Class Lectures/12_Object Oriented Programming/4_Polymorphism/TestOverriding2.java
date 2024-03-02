class Bank {
    int getRateOfInterest() {
        return 0;
    }
}
class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

// Test class to create objects and call the methods
class Test2 {
    public static void main(String args[]) {
        SBI s = new SBI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}