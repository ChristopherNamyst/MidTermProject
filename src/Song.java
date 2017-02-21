/**
 * Created by james on 2/20/17.
 */
public class Song {
    //Setting private Variables
    private String songName;
    private String artName;
    private int rDate;
    private String genre;
    private double price;

    public Song () { //No Arguments Constructor
        songName = "";
        artName = "";
        rDate = 0;
        genre = "";
        price = 0;
    }

    public Song (String songName, String artName, int rDate, String genre, double price) {
        this.songName = songName;
        this.artName = artName;
        this.rDate = rDate;
        this.genre = genre;
        this.price = price;
    }

    @Override
    public String toString() {
        return "You selected" + '\n' +
                "Name: " + songName + '\n' +
                "Artist: " + artName + '\n' +
                "Release: " + rDate + '\n' +
                "Genre: " + genre + '\n' +
                "Price: " + price + '\n';
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public int getrDate() {
        return rDate;
    }

    public void setrDate(int rDate) {
        this.rDate = rDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
