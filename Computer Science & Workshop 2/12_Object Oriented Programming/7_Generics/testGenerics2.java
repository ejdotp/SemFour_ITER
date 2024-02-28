//generic typecasting

import java.util.ArrayList;
import java.util.List;

public class testGenerics2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        String s = list.get(0); //no typecasting needed
        System.out.println(s);
    }
}
