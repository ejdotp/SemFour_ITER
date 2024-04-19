//Q13.  Write  a  java  code  that  comprises  of  a  class Address,  having  member  variable  plot  no,  at,  post  and  required parameterised constructor. Create a Tree map having key as name of a person and value as address. Insert required key and value in the created treemap and use an iterator to display it.  

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address {
    String plotNo;
    String at;
    String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}

public class Q13 {
    public static void main(String[] args) {
        TreeMap<String, Address> treeMap = new TreeMap<>();
        treeMap.put("Ashutosh", new Address("123", "Street A", "City B"));
        treeMap.put("Sujan", new Address("456", "Street C", "City D"));
        treeMap.put("Dishant", new Address("789", "Street E", "City F"));
        Iterator<Map.Entry<String, Address>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Address: " +
                    entry.getValue());
        }
    }
}