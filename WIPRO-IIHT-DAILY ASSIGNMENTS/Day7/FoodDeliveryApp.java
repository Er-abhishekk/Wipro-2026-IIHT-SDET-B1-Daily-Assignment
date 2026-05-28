package Day7;

class OrderProcessing implements Runnable {
    @Override
    public void run() {
        System.out.println("Validating items availability");
        try {
            Threading.sleep(1500);
            System.out.println("Order confirmed.");
        } catch (InterruptedException e) {
            System.out.println("Order Processing interrupted.");
        }
    }
}

class PaymentProcessing implements Runnable {
    @Override
    public void run() {
        System.out.println("Connecting to bank");
        try {
            Threading.sleep(2000); 
            System.out.println("Payment successful!");
        } catch (InterruptedException e) {
            System.out.println("Payment Processing interrupted.");
        }
    }
}

class NotificationService implements Runnable {
    @Override
    public void run() {
        System.out.println("Sending Notification to user");
        try {
            Threading.sleep(1000);
            System.out.println("User notified.");
        } catch (InterruptedException e) {
            System.out.println("Notification interrupted.");
        }
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
      
        Runnable order = new OrderProcessing();
        Runnable payment = new PaymentProcessing();
        Runnable notify = new NotificationService();
        System.out.println("Starting Delivery App Backend");
        order.run();
        payment.run();
        notify.run();
        /*Thread t1 = new Thread(order);
        Thread t2 = new Thread(payment);
        Thread t3 = new Thread(notify);*/

        
        /*t1.start();
        t2.start();
        t3.start();*/
    }
}



