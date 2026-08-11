import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] unique = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == unique[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                unique[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}