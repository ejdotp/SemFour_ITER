//Q14. Find if two strings are anagrams, an anagram is a word or phrase formed by reordering the letters of another word or phrase.  Declare  two  strings  str1  and  str2  and  initialize.  Create  a  HashMap<Character,  Integer>  and  use  methods containsKey() ,put() ,get() to check the strings  

import java.util.HashMap;

public class Q14 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        HashMap<Character, Integer> map = new HashMap<>();

        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {
                if (map.containsKey(str1.charAt(i))) {
                    map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
                } else {
                    map.put(str1.charAt(i), 1);
                }
            }

            for (int i = 0; i < str2.length(); i++) {
                if (map.containsKey(str2.charAt(i))) {
                    map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
                } else {

                    System.out.println(str1 + " and " + str2 + " are not anagrams.");
                    return;
                }
            }
            for (int count : map.values()) {
                if (count != 0) {
                    System.out.println(str1 + " and " + str2 + " are not anagrams.");
                    return;
                }
            }

            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
