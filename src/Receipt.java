import java.text.NumberFormat;

/**
 * Created by Student on 2/20/17.
 */
public class Receipt {

   private double totalTaxes;
    private double subtotal;
    private final double saleTaxes = .06;
    private double receipt;

    NumberFormat nf = NumberFormat.getCurrencyInstance();


    public Receipt (double subtotal) {

        this.subtotal = subtotal;
    }
    public Receipt (double subtotal, double receipt) {

        this.subtotal = subtotal;
        this.receipt = receipt;
    }

    public double getReceipt() {
        return receipt;
    }

    public double getSubtotal() {

        return subtotal;
    }

    public double getTotalTaxes() {
        return getSubtotal() * saleTaxes;
    }

    public double getSaleTaxes() {
        return saleTaxes;

    }

    public void setReceipt(double receipt) {
        this.receipt = receipt;
    }

    public double getGrandTotal() {

        return getSubtotal() + getTotalTaxes();
    }
    public String toString(){
        return "Your subtotal" +" "+ nf.format(getSubtotal()) +"\n"
              +"Your Sale Taxes" + " "+ nf.format(getTotalTaxes()) + "\n"
              +"Your Total Due: " + " "+ nf.format(getGrandTotal())+"\n";

    }
}

