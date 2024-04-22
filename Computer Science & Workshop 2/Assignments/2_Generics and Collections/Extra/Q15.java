//Q15. Given an array of integers, print the repeating integers in the array with the help of a HashSet.  

import java.util.HashSet;

public class Q15{
    public static void main(String[]args){
        int[] array = {4,2,3,4,6,2,7,8,2,4};
        printRepeatingIntegers(array);
    }
    
    public static void printRepeatingIntegers(int[] array){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeatingSet = new HashSet<>();
        
        for( int num : array)
            if(!set.add(num))
                repeatingSet.add(num);

        System.out.println("Repeating integers in the array:");
        for(int num : repeatingSet)
            System.out.println(num);
    }
}

/*OutputRepeatingintegersinthearray:24*/
