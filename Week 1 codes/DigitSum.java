import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter your choice (1 = Even Digits Sum, 2 = Odd Digits Sum): ");
        int choice = sc.nextInt();

        int sum = 0;
        int digit;

        while (num > 0) {
            digit = num % 10;

            if (choice == 1 && digit % 2 == 0) {
                sum += digit;
            } else if (choice == 2 && digit % 2 != 0) {
                sum += digit;
            }

            num /= 10;
        }

        if (choice == 1) {
            System.out.println("Sum of even digits = " + sum);
        } else if (choice == 2) {
            System.out.println("Sum of odd digits = " + sum);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}