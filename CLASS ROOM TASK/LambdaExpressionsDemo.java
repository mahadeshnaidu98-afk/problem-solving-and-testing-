import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Comparator;

public class LambdaExpressionsDemo {

    public static void main(String[] args) {

        // 1. Lambda expression to add two integers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        int sum = add.apply(10, 20);

        System.out.println("1. Addition");
        System.out.println("10 + 20 = " + sum);


        // 2. Lambda expression to check whether a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        int number = 10;

        System.out.println("\n2. Even Number Check");
        System.out.println(number + " is even: " + isEven.test(number));


        // 3. Lambda expression to find the square of a number
        Function<Integer, Integer> square = n -> n * n;

        int value = 5;
        int squareResult = square.apply(value);

        System.out.println("\n3. Square of a Number");
        System.out.println("Square of " + value + " = " + squareResult);


        // 4. Lambda expression to compare two strings by length
        Comparator<String> compareByLength =
                (str1, str2) -> Integer.compare(str1.length(), str2.length());

        String str1 = "Java";
        String str2 = "Programming";

        int result = compareByLength.compare(str1, str2);

        System.out.println("\n4. Comparing Strings by Length");

        if (result == 0) {
            System.out.println("Both strings have the same length.");
        } 
        else if (result < 0) {
            System.out.println(str1 + " is shorter than " + str2);
        } 
        else {
            System.out.println(str1 + " is longer than " + str2);
        }
    }
}