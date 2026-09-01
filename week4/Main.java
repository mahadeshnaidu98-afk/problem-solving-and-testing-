import java.util.*;

class BankAccount {
    private int balance;

    BankAccount() {
        balance = 0;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String operation = sc.nextLine().trim();
            String[] parts = operation.split(" ");

            String type = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (type.equals("Deposit")) {
                account.deposit(amount);
            } else if (type.equals("Withdraw")) {
                account.withdraw(amount);
            }
        }

        System.out.println(account.getBalance());

        sc.close();
    }
}