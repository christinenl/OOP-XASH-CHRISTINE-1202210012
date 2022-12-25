import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant r = new Restaurant();
            int csID, orderQty;
            try {

                System.out.println("Enter Customer ID: ");
                csID = input.nextInt();

                System.out.println("Enter how much food to made: ");
                orderQty = input.nextInt();

                Thread tr1 = new Thread(r);
                Waiters w = new Waiters(csID, orderQty);
                Thread tr2 = new Thread(w);

                tr1.start();
                tr2.start();
                tr1.join();
                tr2.join();

            } catch (Exception e) {
                System.out.println("Input must be Integer");
            }
        }
    }
}