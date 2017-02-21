/**
 * Created by christophernamyst on 2/21/17.
 */
public class CartItem {

    private int songQty;
    private Song song;
    private double price = 0.99;

    public CartItem() {
        songQty = 0;
        this.song = song;
        this.price = price;
    }
    public CartItem(int songQuantity, Song song) {
        this.songQty = songQuantity;
        this.song = song;
    }

    @Override
    public String toString() {
        return "" + song + "Quantity: " + songQty
                + " @ " + price;

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

    public double getPrice() { return price; }

}

