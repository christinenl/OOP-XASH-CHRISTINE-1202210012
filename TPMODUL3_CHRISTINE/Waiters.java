public class Waiters implements Runnable {
    private final int orderQty;
    private final int csID;
    static int harga = 25000;

    public Waiters(int csID, int orderQty) {
        this.csID = csID;
        this.orderQty = orderQty;
    }
    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.csID);
        System.out.println("Numbeer of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * harga);
        System.out.println("==========================================================");
    }
    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Food is ready to deliver");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if (Restaurant.number() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");
        }
    }
}