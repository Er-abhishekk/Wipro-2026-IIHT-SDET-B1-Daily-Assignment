package Day5;

interface UPI {
   String upiId();  
   default String pay(int amount, String toUpiId) {
        
        if(amount <= 0) {
            return "Invalid amount or UPI ID";
        }
        String refId = "UPI"; 
        return "PAID Rs" + amount + "\nFrom: " + upiId() + "\nTo: " + toUpiId +"\nRef: " + refId;
    }
}

class GPay implements UPI {
    String myUpiId;
   
    GPay(String id) {
        myUpiId = id;
    }
  
    public String upiId() {
        return myUpiId;
    }
}


public class UpiPay {
    public static void main(String[] args) {      
        
    	UPI tran = new GPay("alpha@ybl");
    	
        System.out.println("Google Pay:");
        System.out.println(tran.pay(220, "shop@paytm"));
        
    }
}