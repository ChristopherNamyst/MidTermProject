import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by christophernamyst on 2/20/17.
 */
public class StoreClass {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        //Setting the Variables
        String songName = "";
        String  artName = "";
        int rDate = 0;
        String genre = "";
       final double price = 0.99;

        System.out.print("Welcome to the BAP App!!!" + '\n' + '\n' +
                "Build a Playlist from these selections: " + '\n' + '\n');
        ;
        ArrayList<Song> TrackMenu = new ArrayList<>();

        Song j1 = new Song("Role Play", "Trey Songz", 2007, "R & B", price);
        TrackMenu.add(j1);
        Song j2 = new Song("Wonderwall","Oasis",1995, "Alternative", price);
        TrackMenu.add(j2);
        Song j3 = new Song("Deja Vu", "J. Cole", 2017, "Hip-Hop", price);
        TrackMenu.add(j3);
        Song j4 = new Song("You Aint Gotta Lie","Kendrick Lamar",2015, "Hip-Hop", price);
        TrackMenu.add(j4);
        Song j5 = new Song( "Time and Time Again", "Chronic Future", 2004, "Alternative", price);
        TrackMenu.add(j5);
        Song la1 = new Song("Beam Me Up Scotty", "Nicki Minaj", 2009, "Hip-Hop", price);
        TrackMenu.add(la1);
        Song la2 = new Song("No More Lies","Michelle",1989,"R & B",price);
        TrackMenu.add(la2);
        Song la3 = new Song("Go Get It", "Mary Mary", 2012, "Gospel", price);
        TrackMenu.add(la3);
        Song la4 = new Song("Poison", "(BBD) Bell Biv Devoe", 1990, "R & B", price);
        TrackMenu.add(la4);
        Song la5 = new Song("Dial My Heart", "The Boys", 1988, "R & B", price);
        TrackMenu.add(la5);
        Song c1 = new Song("Around the World", "Daft Punk", 1997, "House", price);
        TrackMenu.add(c1);
        Song c2 = new Song("Canned Heat", "Jamiroquai", 1997,"House",price);
        TrackMenu.add(c2);
        Song c3 = new Song("When a Fire Starts to Burn", "Disclosure", 2013, "House", price);
        TrackMenu.add(c3);
        Song c4 = new Song("The Whistle Song", "Frankie Knuckles", 1991, "House", price);
        TrackMenu.add(c4);
        Song c5 = new Song("Go Bang(Francious K Mix)","Dinosaur L" ,1982,"House",price);
        TrackMenu.add(c5);

        int i = 1;
        for (Song s : TrackMenu) {
            System.out.println("(" + i + ")  " + s.getArtName() + " - " + s.getSongName() + "\n");
            i++;
        }

        int songQty = Validator.getInt(user, "Please Enter the Amount of Songs you'd like to buy: ");







    }

}
