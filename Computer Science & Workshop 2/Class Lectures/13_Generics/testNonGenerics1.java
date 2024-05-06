import java.util.ArrayList;
import java.util.List;
public class testNonGenerics1 {
    @SuppressWarnings({ "unchecked", "rawtypes" }) //ignore
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10); //int
        list.add("20"); //string
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));  // loop printing
        }
        System.out.println(list.toString()); //direct printing
    }
}
