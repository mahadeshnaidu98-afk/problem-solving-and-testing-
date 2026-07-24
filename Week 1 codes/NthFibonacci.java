import java.util.Scanner;

public class NthFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input N
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int first = 0, second = 1, next = 0;

        if (n == 0) {
            System.out.println("Nth Fibonacci number = 0");
        } else if (n == 1) {
            System.out.println("Nth Fibonacci number = 1");
        } else {
            for (int i = 2; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println("Nth Fibonacci number = " + next);
        }

        sc.close();
    }
}