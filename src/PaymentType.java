import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Student on 2/20/17.
 */
public class PaymentType {

    static NumberFormat nf = NumberFormat.getCurrencyInstance();

    public static void takePaypal(Scanner scan, double amountDue) {
        String email = Validator.getString( scan," Please enter your Paypal ID email: ");



        System.out.println("Paypal ID: " + email + " has been charged:  " + '\t' + nf.format(amountDue));

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






        System.out.println(nf.format(amountDue)+ " Charged to Card # "+ "xxxxxxxxxxxx "
                + String.valueOf(credit).substring(12, 16) +"\n "+
                "Expiration year:" + month + "/" + year + "\n" +
                " CVV #" + cvv);

    }


}