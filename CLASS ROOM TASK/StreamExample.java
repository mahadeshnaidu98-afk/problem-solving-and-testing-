import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {

        int[] marks = {65, 80, 92, 70, 76, 55, 88};

        long count = Arrays.stream(marks)
                .filter(mark -> mark > 75)
                .count();

        System.out.println("Students above 75: " + count);
    }
}