package Day5;

class SecurePaymentProcessor {
    private final String merchantId;
    
    public SecurePaymentProcessor(String merchantId) {
        this.merchantId = merchantId;
    }
    
    public final void processPayment(int amount, String cardNum) {
        validateCard(cardNum);
        encryptCard(cardNum);
        authorizePayment(amount);
        System.out.println("Secure Payment Processed: Rs" + amount + "Merchant: " + merchantId);
    }
    
    private void validateCard(String cardNumber) {
        System.out.println("Validating card: " + maskCard(cardNumber));
    }
    
    private void encryptCard(String cardNumber) {
        System.out.println("Encrypting card data");
    }
    
    private void authorizePayment(int amount) {
        System.out.println("Authorizing" + amount);
    }
    
    private String maskCard(String card) {
        return card.substring(0, 4) + "****" + card.substring(12);
    }
}


class CardProcessor extends SecurePaymentProcessor {
    public CardProcessor(String merchantId) {
        super(merchantId);
    }
    public void customMethod() {
        System.out.println("Custom logic OK");
    }
}

class Payment {
    public static void main(String[] args) {
        SecurePaymentProcessor processor = new SecurePaymentProcessor("MERCH001");
        CardProcessor ccProcessor = new CardProcessor("MERCH002");
        
        System.out.println("Secure Payment Processing");
        processor.processPayment(99, "1234567890123456");
        
        System.out.println("\n Subclass uses SAME secure logic ");
        ccProcessor.processPayment(199, "9876543210987654");
    }
}
