/* Design a class contains private data members of integer and double type along with
methods. Create two objects which call the required method to initialize/set/update the
data members of the defined class. Use the Runtime class to calculate the total
memory allocated and the memory occupied by the objects. Use any one technique as
you know to make objects unreachable, hence eligible for garbage collection. At the
end, call Runtime class again to recheck the utilized/total memory. */

public class Q7 {
    private int integer;
    private double decimal;
    
    public void setValues(int integer, double decimal) {
        this.integer = integer;
        this.decimal = decimal;
    }
    
    public void updateValues(int integer, double decimal) {
        this.integer += integer;
        this.decimal += decimal;
    }
    
    public static void main(String[] args) {
        Q7 obj1 = new Q7();
        Q7 obj2 = new Q7();
        
        obj1.setValues(10, 10.5);
        obj2.setValues(20, 20.5);
        
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Memory Occupied by Objects: " + (runtime.totalMemory() - runtime.freeMemory()));
        
        obj1 = null;
        obj2 = null;
        
        System.gc();
        
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Memory Occupied by Objects: " + (runtime.totalMemory() - runtime.freeMemory()));
    }
}
