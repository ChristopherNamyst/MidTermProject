import java.util.Scanner;

/**
 * Created by Student on 2/20/17.
 */
public class PaymentType {


    public static String takePaypal(Scanner scan, double amountDue) {
        //System.out.println(" Please enter your email address associated with your Paypal ID: ");
        string email = scan.nextString();

        }
        System.out.println(" Your Paypal ID has been charged.. " + (cash - amountDue));
    }






    public static void takeCredit(Scanner scan1,double creditNum) {

            System.out.println(" What is the Credit card #: ");
            double credit = scan1.nextDouble();

            System.out.println(" What is the expiration month: ");
            int month = scan1.nextInt();

            System.out.println(" What is the expiration date: ");
            double year = scan1.nextInt();

            System.out.println(" What is your CVV(3 Digit Code on the back of the card)?: ");
            int cvv = scan1.nextInt();

            System.out.println(credit + "" + month + "/" + year + "       " + cvv);
        }


}