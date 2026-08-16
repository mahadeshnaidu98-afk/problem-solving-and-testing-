import java.util.*;
import java.util.function.*;

public class HigherOrderFunctionsDemo {

    // 1. Method that accepts a Function<Integer, Integer>
    public static int applyFunction(int number, Function<Integer, Integer> function) {
        return function.apply(number);
    }


    // 2. Method that accepts a Predicate<Integer> and filters numbers
    public static List<Integer> filterNumbers(
            List<Integer> numbers,
            Predicate<Integer> predicate) {

        List<Integer> result = new ArrayList<>();

        for (int number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }

        return result;
    }


    // 3. Method that accepts a Consumer<String>
    //    and processes a list of names
    public static void processNames(
            List<String> names,
            Consumer<String> consumer) {

        for (String name : names) {
            consumer.accept(name);
        }
    }


    // 4. Method that takes two functions
    //    and applies them sequentially
    public static int applySequentially(
            int number,
            Function<Integer, Integer> firstFunction,
            Function<Integer, Integer> secondFunction) {

        int firstResult = firstFunction.apply(number);

        return secondFunction.apply(firstResult);
    }


    // Main method
    public static void main(String[] args) {

        // ------------------------------------------------
        // 1. Function<Integer, Integer>
        // ------------------------------------------------

        Function<Integer, Integer> square = n -> n * n;

        int number = 5;

        int result = applyFunction(number, square);

        System.out.println("1. Function Example");
        System.out.println("Square of " + number + " = " + result);


        // ------------------------------------------------
        // 2. Predicate<Integer> to filter numbers
        // ------------------------------------------------

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> evenNumbers =
                filterNumbers(numbers, isEven);

        System.out.println("\n2. Predicate Example");
        System.out.println("Original numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);


        // ------------------------------------------------
        // 3. Consumer<String> to process names
        // ------------------------------------------------

        List<String> names =
                Arrays.asList("Navaneet", "Rahul", "Arjun", "Kiran");

        Consumer<String> printName =
                name -> System.out.println("Hello, " + name);

        System.out.println("\n3. Consumer Example");

        processNames(names, printName);


        // ------------------------------------------------
        // 4. Applying two functions sequentially
        // ------------------------------------------------

        Function<Integer, Integer> multiplyByTwo =
                n -> n * 2;

        Function<Integer, Integer> addTen =
                n -> n + 10;

        int input = 5;

        int finalResult =
                applySequentially(input, multiplyByTwo, addTen);

        System.out.println("\n4. Sequential Functions Example");
        System.out.println("Input = " + input);
        System.out.println("After multiply by 2 = " + (input * 2));
        System.out.println("After adding 10 = " + finalResult);
    }
}