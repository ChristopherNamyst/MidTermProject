/**
 * Created by Student on 2/20/17.
 */
public class Receipt {

   private double totalTaxes;
    private double subtotal;
    private final double saleTaxes = .06;
    private double receipt;
    protected double grandTotal= saleTaxes + subtotal;


    public Receipt (double subtotal) {

        this.subtotal = subtotal;
    }
    public Receipt (double subtotal, double receipt) {

        this.subtotal = subtotal;
        this.receipt = receipt;
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getSaleTaxes() {
        return saleTaxes;
    }

    public double getReceipt() {
        return receipt;
    }

    public double getGrandTotal() {
      return subtotal + totalTaxes;
    }

    public void setTotalTaxes(double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setReceipt(double receipt) {
        this.receipt = receipt;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
    public String toString(){
        return "Your subtotal" +" "+ subtotal +"\n"
              +"Your Sale Taxes" + " "+ saleTaxes+"\n"
              +"Your Total: " + " "+ (saleTaxes + subtotal)  +"\n";

    }
}

