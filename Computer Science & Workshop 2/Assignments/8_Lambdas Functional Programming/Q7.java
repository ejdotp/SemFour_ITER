
// Q7.Write a program that calculates factorial using a recursive
// lambdaexpression. Define a recursive lambda expression to calculatefactorial.
// Use the lambda expression to calculate factorial ofagiven number.
import java.util.function.Function;

class RecursiveFactorial {
    public static void main(String[] args) {
        // Define a recursive lambda expression to calculate factorial
        Function<Integer, Integer> factorial = new Function<>() {
            @Override
            public Integer apply(Integer n) {
                return n == 0 ? 1 : n * this.apply(n - 1);
            }
        };
        
        // Test the lambda expression to calculate factorial of a given number
        int num = 5;
        int result = factorial.apply(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
