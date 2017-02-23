
import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by christophernamyst on 2/20/17.
 */
public class StoreClass {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        ///////////////SETTING VARIABLES///////////////////////////////////////////
        String songName = "";
        String artName = "";
        int rDate = 0;
        String genre = "";
        final double price = 0.99;

        ///////////////INITIAL GREETING/////////////////////////////////////////////
        System.out.print("Welcome to the BAP App!!!" + '\n' + '\n' +
                "Let's build a Playlist from these selections: " + '\n' + '\n');

        ///////////////INITIALIZE AND DECLARE ARRAY LISTS///////////////////////////
        ArrayList<Song> TrackMenu = new ArrayList<>();
        ArrayList<CartItem> CartList = new ArrayList<>();

        ///////////////OUR LIST OF SONGS TO BE ADDED TO PLAYLIST TBD BY USER////////
        Song j1 = new Song("Role Play", "Trey Songz", 2007, "R & B ", price);
        TrackMenu.add(j1);
        Song j2 = new Song("Wonderwall", "Oasis", 1995, "Alternative ", price);
        TrackMenu.add(j2);
        Song j3 = new Song("Deja Vu", "J. Cole", 2017, "Hip-Hop ", price);
        TrackMenu.add(j3);
        Song j4 = new Song("You Aint Gotta Lie ", "Kendrick Lamar", 2015, "Hip-Hop", price);
        TrackMenu.add(j4);
        Song j5 = new Song("Time and Time Again", "Chronic Future", 2004, "Alternative ", price);
        TrackMenu.add(j5);
        Song la1 = new Song("Beam Me Up Scotty", "Nicki Minaj", 2009, "Hip-Hop ", price);
        TrackMenu.add(la1);
        Song la2 = new Song("No More Lies", "Michelle", 1989, "R & B ", price);
        TrackMenu.add(la2);
        Song la3 = new Song("Go Get It", "Mary Mary", 2012, "Gospel ", price);
        TrackMenu.add(la3);
        Song la4 = new Song("Poison", "(BBD) Bell Biv Devoe", 1990, "R & B ", price);
        TrackMenu.add(la4);
        Song la5 = new Song("Dial My Heart", "The Boys", 1988, "R & B ", price);
        TrackMenu.add(la5);
        Song c1 = new Song("Around the World", "Daft Punk", 1997, "House ", price);
        TrackMenu.add(c1);
        Song c2 = new Song("Canned Heat", "Jamiroquai", 1997, "House ", price);
        TrackMenu.add(c2);
        Song c3 = new Song("When a Fire Starts to Burn", "Disclosure", 2013, "House ", price);
        TrackMenu.add(c3);
        Song c4 = new Song("The Whistle Song", "Frankie Knuckles", 1991, "House ", price);
        TrackMenu.add(c4);
        Song c5 = new Song("Go Bang(Francois K Mix)", "Dinosaur L", 1982, "House ", price);
        TrackMenu.add(c5);


        ////////////////ENHANCED FOR LOOP/////////////////////////////////////////////////
        int i = 1;
        for (Song s : TrackMenu) {
            System.out.println("(" + i + ")  " + s.getArtName() + " - " + s.getSongName());
            i++;
        }

        ///////////////PRINTED STATEMENT TO DESCRIBE OUR SERVICES TO THE USER////////////////////////////////
        System.out.println(" ");

     //   int numTracks = Validator.getInt(user, "Here in the BAP App, we offer every song for $0.99! \n" +

       int numTracks = Validator.getInt(user, "Here in the BAP App, we offer every song for $0.99! \n"
               + "Please Enter the Amount of Songs you'd like to buy: ");
        System.out.println();

        ///////////////GETTING THE SONG INFORMATION FROM USER////////////////////////////////////////////////
        int songQuantity = 0;
        for (i = 0; i < numTracks; i++) {

            /////////ASKING USER TO INPUT A LOCATION NUMBER THAT CORRELATES TO CORRESPONDING SONG/////////////
            int songChoice = Validator.getInt(user, "Enter the Song Number You'd Like to Purchase: ", 1, 15);
            System.out.println();
            System.out.println(TrackMenu.get(songChoice - 1));

            Song track = TrackMenu.get(songChoice - 1);

            ////////ASKING USER TO INPUT HOW MANY COPIES OF EACH SONG WILL BE ADDED TO THEIR CART/////////////
            songQuantity = Validator.getInt(user, "How many Copies?");

         /*   while (numTracks < songQuantity){
                System.out.println( " You have another copy to select");
            }*/

            ////////CREATING A CART ITEM WITH SONG INFORMATION AND QUANTITY//////////////////////////////////


            //create a cart item with the track and a quantity

            CartItem newItem = new CartItem(songQuantity, track);

            ////////USING A METHOD TO ADD ITEM(SONG) TO CART/////////////////////////////////////////////////
            CartList.add(newItem);

        }


        ////////////////////////THANKING USER FOR THEIR PURCHASE/////////////////////////////////////////////
        System.out.println();

        System.out.println("Thanks for your purchase. Your Order is: ");
        System.out.println("===========================================");
        System.out.println(" ");

        for (CartItem c : CartList) {
            System.out.println(c);
        }
//
        double amountDue =  price * songQuantity;
        System.out.println();
        int payment1 = Validator.getInt(user, "Please enter your preferred method of payment.\n" +
                "1 for Credit. 2 for Paypal: ", 1, 2);


        //Call the Receipt Class
        Receipt receipt = new Receipt(amountDue);
        amountDue = price * songQuantity-receipt.getGrandTotal();
        System.out.println(" ");
       // receipt.getGrandTotal();

       // System.out.println( " Subtotal: " +" $"+ amountDue);


      // Receipt receipt = new Receipt(amountDue);
       System.out.println(receipt);

       // Receipt receipt1 = new Receipt();
        receipt.getGrandTotal();


        double creditNum = 0;
        if (payment1 == 1) {
            PaymentType.takeCredit(user, amountDue);

        } else if (payment1 == 2){
            PaymentType.takePaypal(user, amountDue);
        }else {
            System.out.print("Invaild payment");
        }

    }

}

