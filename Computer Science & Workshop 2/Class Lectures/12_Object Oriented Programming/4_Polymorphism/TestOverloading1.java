class Multiplier {
    static int mul(int a, int b) {
        return a * b;
    }

    static int mul(int a, int b, int c) {
        return a * b * c;
    }

    static double mul(double a, double b) {
        return a * b;
    }
}

class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(Multiplier.mul(11, 11));
        System.out.println(Multiplier.mul(11, 11, 11));
        System.out.println(Multiplier.mul(11.1, 11.1));
    }
}
