
/**
 * Created by Student on 2/20/17.
 */
public class ReceiptClass {
    private double totalTaxes;
    private double subtotal;
    private double saleTaxes = .06;

    public ReceiptClass () {
        subtotal = 0.0;
        saleTaxes = .06;


    }
    public ReceiptClass (double subtotal) {
        this.subtotal = subtotal;
        this.totalTaxes = subtotal * saleTaxes;

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

    public double getGrandTotal(){

        return subtotal +totalTaxes ;
    }

}
    public void setSaleTaxes(double saleTaxes) {
        this.saleTaxes = .06;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
}
