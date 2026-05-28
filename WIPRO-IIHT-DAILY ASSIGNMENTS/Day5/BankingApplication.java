package Day5;

class BankAccount {
    private final String accountNumber; 
    private int balance;
    
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void deposit(int amount) {
        balance += amount;
    }
    
    public void showInfo() {
        System.out.println("Account: " + accountNumber + " Balance: RS" + balance);
    }
    
}
public class BankingApplication {
	public static void main(String[] args) {
        BankAccount acc = new BankAccount("ABC123", 1000);
        BankAccount acc2 = new BankAccount("BCD1234", 2000);
        
        
        System.out.print("Before: ");
        acc.showInfo();
        
        acc.deposit(500);
        System.out.print("After deposit: ");
        
        acc.showInfo();
        System.out.println("Account number: " + acc.getAccountNumber());
        
        System.out.println("");        
        
        // acc2
        System.out.print("Before: ");
        acc2.showInfo();
        
        acc2.deposit(700);
        System.out.print("After deposit: ");
        
        acc2.showInfo();
        System.out.println("Account number: " + acc2.getAccountNumber());
    }
}
