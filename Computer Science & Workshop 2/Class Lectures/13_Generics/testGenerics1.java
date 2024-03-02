import java.util.ArrayList;
import java.util.List;

public class testGenerics1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10); //int
        // list.add("20"); "The method add(Integer) in the type List<Integer> is not applicable for the arguments (String)"
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));  // loop printing
        }
        System.out.println(list.toString()); //direct printing
    }
}
