import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Student on 2/20/17.
 */
public class PaymentType {


    public static void takePaypal(Scanner scan, double amountDue) {
        System.out.println(" Please enter your email address associated with your Paypal ID: ");
        String email = scan.next();

        System.out.println( "How much is on you card");
        double cash=scan.nextDouble();

        double salesTaxes=.06;

        while (cash < amountDue) {
            System.out.print(" This is short you owe:");
            cash = scan.nextDouble();
        }

//////////////////////////// What if there is not enough on the card//////////////////////////////////////////////////


      //  System.out.println(" Your Paypal ID has been charged. " + (salesTaxes * amountDue));
        // return (salesTaxes * amountDue )- cash;
    }

    public static void takeCredit(Scanner scan1, double amountDue) {

        System.out.println(" What is the Credit card #: ");
        long credit = scan1.nextLong();

        System.out.println(" What is the expiration month: ");
        int month = scan1.nextInt();

        System.out.println(" What is the expiration date: ");
        int year = scan1.nextInt();

        System.out.println(" What is your CVV(3 Digit Code on the back of the card)?: ");
        int cvv = scan1.nextInt();
        System.out.println();


        NumberFormat nf = NumberFormat.getCurrencyInstance();



        System.out.println(nf.format(amountDue)+ " Charged to Card # "+ "xxxxxxxxxxxx "
                + String.valueOf(credit).substring(12, 16) +"\n "+
                "Expiration year:" + month + "/" + year + "\n" +
                " CVV #" + cvv);

    }


}