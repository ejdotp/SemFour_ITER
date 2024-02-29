//Non generic typecasting

import java.util.ArrayList;
import java.util.List;

public class testNonGeneric2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String s = (String)list.get(0); //(string) typecasting needed
        System.out.println(s);
    }
}
