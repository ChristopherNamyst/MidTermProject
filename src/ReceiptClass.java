<<<<<<< HEAD
package bootcamp;
=======
>>>>>>> ee24050fb2b72eec388bc9c1450d04198776eea4

/**
 * Created by Student on 2/20/17.
 */
public class ReceiptClass {
<<<<<<< HEAD
  private double subtotal;
    private double saleTaxes;
    private double grandTotal;
    final double PRICE = .99;
    protected int quantity = 0;

    public ReceiptClass () {
        subtotal = 0.0;


    }
    public ReceiptClass (double subtotal, double saleTaxes, double grandTotal) {
        subtotal = quantity * PRICE;
        saleTaxes = .06;
        grandTotal = grandTotal;
=======
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
>>>>>>> ee24050fb2b72eec388bc9c1450d04198776eea4

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
