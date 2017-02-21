import java.util.Scanner;

/**
 * Created by Student on 2/20/17.
 */
public class PaymentTypeClass {
    public static void takeCash(Scanner scan, double amounDue) {
        System.out.println(" How much cash are you paying:");
        double cash = scan.nextDouble();

        while (cash < amounDue) {
            System.out.print(" This is short you owe:");
            cash = scan.nextDouble();
        }
        System.out.print(" Your change is : " + (cash - amounDue));
    }

    public static void takeCredit(Scanner scan1,double creditNum) {

            System.out.println(" What is the Credit card #:");
            double credit = scan1.nextDouble();

            System.out.println(" What is the expiratoin month: ");
            int month = scan1.nextInt();

            System.out.println(" What is the expiratoin day: ");
            double year = scan1.nextInt();

            System.out.println(" What is your CVV:");
            int cvv = scan1.nextInt();

            System.out.println(credit + "" + month + "/" + year + "       " + cvv);
        }
    public static void takeCheck(Scanner scan2) {
        System.out.println(" What is the Check card #:");
        double checkNum = scan2.nextDouble();
    }

}