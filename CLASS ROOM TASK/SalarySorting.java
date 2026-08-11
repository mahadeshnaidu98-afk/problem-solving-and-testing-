import java.util.Arrays;

public class SalarySorting {
    public static void main(String[] args) {

        int[] salary = {50000, 25000, 75000, 40000, 60000};

        Arrays.stream(salary)
              .boxed()
              .sorted((a, b) -> b - a)
              .forEach(s -> System.out.print(s + " "));
    }
}