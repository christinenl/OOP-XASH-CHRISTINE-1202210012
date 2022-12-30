import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation calcu = new Calculation();
        Thread thread = new Thread(calcu);
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        do {
            System.out.println("\n==Menu Program==");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            System.out.print("Select menu : ");
            try {
                int menu_program = scan.nextInt();
                System.out.println();
                switch (menu_program) {
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double side = scan.nextDouble();

                        calcu.setSquare(side);
                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + calcu.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double jari_jari = scan.nextDouble();
                        calcu.setCircle(jari_jari);

                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + calcu.getCircle());
                        break;
                    case 3:
                        System.out.print("Insert the side of the base of the trapezoid : ");
                        double base = scan.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double upper = scan.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double height = scan.nextDouble();
                        calcu.setTrapezoid(base, upper, height);

                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + calcu.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("The program is finished");
                    default:
                        System.out.println("\nOptions not available\n");

                        continue;
                }
                repeat = false;

            } catch (InputMismatchException error) {
                System.out.println("\n====Error: Input must be a number====\n");
                scan.next();
            } catch (IllegalArgumentException error) {
                System.out.println();
                System.out.println(error);
                System.out.println();
            } catch (InterruptedException error) {
                System.out.println(error);
            }
        } while(repeat);
        scan.close();
    }
}