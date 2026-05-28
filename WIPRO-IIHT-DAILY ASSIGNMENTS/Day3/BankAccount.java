package Day3;

public class BankAccount {
	private int balance;

    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("amount has been added");
        }
    }

    public void withdraw(int amount) {
        if(amount <= balance){
            balance -= amount;
            System.out.println("debit"+ amount + " left balance" +balance );
        }else{
            System.out.println("Invalid amount");
        }
    }

    public int getBalance() {
        return balance;
    }
    public static void main(String[] arg) {
    	BankAccount idbi = new BankAccount();
    	idbi.deposit(1000);
    	idbi.withdraw(400);
    }
}
