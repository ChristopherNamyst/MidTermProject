/**
 * Created by james on 2/20/17.
 */
public class Song extends CartItem {
    ///////////////////SETTING PRIVATE VARIABLES FOR USE THROUGHOUT THE PROJECT////////////
    private String songName;
    private String artName;
    private int rDate;
    private String genre;

    //////////////////NO ARGUMENTS CONSTRUCTOR, BUILDING BLOCKS OF VARIABLES//////
    public Song () {
        songName = "";
        artName = "";
        rDate = 0;
        genre = "";
    }
    ////////////////DECLARING OUR SONG/////////////////////////////////////////////////
    public Song (String songName, String artName, int rDate, String genre, double price) {
        this.songName = songName;
        this.artName = artName;
        this.rDate = rDate;
        this.genre = genre;

    }
    ///////////////OUR ToString, SET UP TO RECEIVE AND USE INFORMATION/////////////////
    @Override
    public String toString() {
        return "Name: " + songName + "\t" +
                "Artist: " + artName + '\n' +
                "Release: " + rDate + "\t" +
                "Genre: " + genre;
    }
    /////////////GETTER FOR SONG NAME/////////////////
    public String getSongName() {
        return songName;
    }
    ////////////SETTER FOR SONG NAME/////////////////
    public void setSongName(String songName) {
        this.songName = songName;
    }
    ////////////GETTER FOR ARTIST NAME//////////////
    public String getArtName() {
        return artName;
    }
    ///////////SETTER FOR ARTIST NAME///////////////
    public void setArtName(String artName) {
        this.artName = artName;
    }
    //////////GETTER FOR SONG RELEASE DATE//////////
    public int getrDate() {
        return rDate;
    }
    //////////SETTER FOR SONG RELEASE DATE//////////
    public void setrDate(int rDate) {
        this.rDate = rDate;
    }
    //////////GETTER FOR SONG GENRE//////////////////////
    public String getGenre() {
        return genre;
    }
    //////////SETTER FOR SONG GENERE////////////////
    public void setGenre(String genre) {
        this.genre = genre;
    }




}
