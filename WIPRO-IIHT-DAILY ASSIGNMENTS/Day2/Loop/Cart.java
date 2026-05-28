package Day2.Loop;
import java.util.*;

public class Cart {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int price;

        System.out.println("Enter item prices (enter 0 to finish):");
        while (true) {
            price = sc.nextInt();
            if (price == 0) break;
            total += price;
        }

        System.out.println("Total Amount: " + total);
    }
}
