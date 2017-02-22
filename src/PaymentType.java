import java.util.Scanner;

/**
 * Created by Student on 2/20/17.
 */
public class PaymentType {





    public static void takeCash(Scanner scan, double amountDue) {
        System.out.println(" How much cash are you paying:");
        double cash = scan.nextDouble();

        while (cash < amountDue) {
            System.out.print(" This is short you owe:");
            cash = scan.nextDouble();
        }
        System.out.print(" Your change is : " + (cash - amountDue));
    }

    public static void takeCredit(Scanner scan1,double creditNum) {

            System.out.println(" What is the Credit card #:");
            double credit = scan1.nextDouble();

            System.out.println(" What is the expiration month: ");
            int month = scan1.nextInt();

            System.out.println(" What is the expiration day: ");
            double year = scan1.nextInt();

            System.out.println(" What is your CVV:");
            int cvv = scan1.nextInt();
            System.out.println();


            System.out.println(" Card # "+" "+ credit +"\n "+
                    "Expiration year:" + month + "/" + year + "\n" +
                    " CVV #" + cvv);


        }
    public static void takeCheck(Scanner scan2, double checkNumAmount) {
        System.out.println(" What is the Check card #:");
        double check = scan2.nextDouble();

        System.out.println(" How much are you Writing the check for:");
        double amount = scan2.nextDouble();


        System.out.print(" Your change is : " + (amount- checkNumAmount));



        }


    }

