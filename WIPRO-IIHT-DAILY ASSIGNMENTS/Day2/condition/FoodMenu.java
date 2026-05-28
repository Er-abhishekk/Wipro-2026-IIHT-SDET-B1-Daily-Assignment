package Day2.condition;

public class FoodMenu {
    public static void main(String[] args) {
        System.out.println("Menu:\n1. Burger\n2. Pizza\n3. Pasta \nyou selected");
        
        int choice = 3;

        switch (choice) {
            case 1:
                System.out.println("Burger");
                break;
            case 2:
                System.out.println("Pizza");
                break;
            case 3:
                System.out.println("Pasta");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

