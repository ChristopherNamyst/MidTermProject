/**
 * Created by christophernamyst on 2/21/17.
 */
public class CartItem {

    private int songQty;
    private Song song;


    public CartItem(int songQty, Song song) {
        this.songQty = songQty;
        this.song = song;
    }

    @Override
    public String toString() {
        return "" + song + songQty;

    }

    public int getSongQty() {
        return songQty;
    }

    public void setSongQty(int songQty) {
        this.songQty = songQty;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

}

