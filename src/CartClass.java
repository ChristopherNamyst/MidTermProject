/**
 * Created by christophernamyst on 2/21/17.
 */
public class CartItem {

    private int songQuantity;
    private Song song;


    public CartItem(int songQuantity, Song song) {
        this.songQuantity = songQuantity;
        this.song = song;
    }

    @Override
    public String toString() {
        return "" + song + songQuantity;

    }

    public int getSongQuantity() {
        return songQuantity;
    }

    public void setSongQuantity(int songQuantity) {
        this.songQuantity = songQuantity;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

}

