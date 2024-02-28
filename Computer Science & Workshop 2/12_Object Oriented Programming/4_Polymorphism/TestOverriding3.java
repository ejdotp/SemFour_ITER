class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Rat extends Animal{
    void eat(){
        System.out.println("Eating Bread")
    }
}

class snake extends Animal{
    void eat(){
        System.out.println("eating rat");
    }
}

class Polymorphism{
    public static void main(String[] args) {
        Animal a = new Rat();
        Animal b = new Snake();
        a.eat();
        b.eat();
    }
}