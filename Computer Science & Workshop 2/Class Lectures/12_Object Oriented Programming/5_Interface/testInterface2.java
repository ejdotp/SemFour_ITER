interface stand {
    public void standing();
}

interface walk{
    public void walking();
}

interface run{
    public void running();
}

class Alaswa implements stand, walk, run{
    public void standing(){
        System.out.println("Standed");
    }
    public void walking(){
        System.out.println("Walked");
    }
    public void running(){
        System.out.println("Runned");
    }
}

public class testInterface2 {
    public static void main(String[] args) {
        Alaswa alas = new Alaswa();
        alas.standing(); // Call
        alas.walking(); // Call
        alas.running(); // Call
    }
}
