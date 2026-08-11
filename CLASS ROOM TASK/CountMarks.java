import java.util.Scanner;

public class CountMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] marks = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();

            if (marks[i] > 75) {
                count++;
            }
        }

        System.out.println("Students above 75 = " + count);

        sc.close();
    }
}