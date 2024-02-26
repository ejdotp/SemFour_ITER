interface MyInterface1 {
    public void method1();
}

interface MyInterface2{
    public void method2();
}

class DemoClass implements MyInterface1, MyInterface2{
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Method 2");
    }
}

public class testInterface1 {
    public static void main(String[] args) {
        DemoClass dc = new DemoClass();
        dc.method1(); // Call
        dc.method2(); // Call
    }
}
