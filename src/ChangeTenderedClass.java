/**
 * Created by christophernamyst on 2/21/17.
 */

import java.util.Scanner;

public class ChangeTenderedClass  {

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);////INITIATES SCANNER////

        double amountDue;
        double amountTendered;
        int remainingAmount;

        String outputDisplay;
        String answer;

        do {
            System.out.println("\n");

            System.out.println("Enter the amount due. ");
            amountDue = input.nextDouble();  // will read a double and store it in amountDue variable
            // then determine if it is a valid entry
            System.out.println("Enter the amount tendered.");
            amountTendered = input.nextDouble();      // will read a double and store it in amountTendered variable
            // then determine if it is a valid entry
            remainingAmount = (int)((amountTendered - amountDue)*100);


            outputDisplay = "Your total was " + "$" + amountDue + " and you gave me " + "$" + amountTendered + ".  " + "Your change is: \n" +

            System.out.println(outputDisplay);

            System.out.println("Would you like to make another purchase? ");
            answer =  input.next();
        }

        while (answer.equalsIgnoreCase("YES"));

    }

}

