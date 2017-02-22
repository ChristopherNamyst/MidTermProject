/**
 * Created by Student on 2/20/17.
 */
public class Receipt {

   private double totalTaxes;
    private double subtotal;
    private final double saleTaxes = .06;
    private double receipt;


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
        return totalTaxes;
    }

    public double getSaleTaxes() {
        return saleTaxes;

    }

    public void setReceipt(double receipt) {
        this.receipt = receipt;
    }

    public double getGrandTotal() {

        return subtotal + totalTaxes;
    }
    public String toString(){
        return "Your subtotal" +" "+ subtotal +"\n"
              +"Your Sale Taxes" + " "+ saleTaxes+"\n"
              +"Your Total: " + " "+ (saleTaxes + subtotal)  +"\n";

    }
}

