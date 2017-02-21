import java.util.Scanner;

/**
 * Created by Student on 2/20/17.
 */
public class PaymentTypeClass {
    public static void takeCash(Scanner scan, double amounDue){
        System.out.print(" How much cash are you paying:" );
        double cash=scan.nextDouble();

        while (cash < amounDue){
            System.out.print(" This is short you owe:" );
            cash=scan.nextDouble();
        }
        System.out.print(" Your change is : " + (cash - amounDue));

        //public static void takeCredit(Scanner scan1 ,double)
    }


}