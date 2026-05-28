package Day7;

class FoodDelivery extends Thread {
    static final Object lock = new Object(); 
    
    public FoodDelivery(String name) {
        setName(name);
    }
    
    @Override
    public void run() {
       synchronized(lock) {
            try {
                System.out.println(getName() + " started");
                Thread.sleep(2000);
                System.out.println(getName() + " completed");
            } catch(InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
   
}

public class Threading {
    public static void main(String[] args) throws InterruptedException {
        FoodDelivery order = new FoodDelivery("Order Processing");
        FoodDelivery kitchen = new FoodDelivery("Kitchen Preparation");
        FoodDelivery delivery = new FoodDelivery("Delivery Service");
        
        order.setPriority(Thread.MAX_PRIORITY);
        kitchen.setPriority(Thread.NORM_PRIORITY);
        delivery.setPriority(Thread.MIN_PRIORITY);
        
        order.start();
        kitchen.start();
        delivery.start();
        
        System.out.println("Is order Alive? " + order.isAlive());       
     
        order.join();
        kitchen.join();
        delivery.join();
        
        System.out.println("All tasks completed.");
    }
}