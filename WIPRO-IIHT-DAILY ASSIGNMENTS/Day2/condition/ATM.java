package Day2.condition;
import java.util.*;

public class ATM {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
