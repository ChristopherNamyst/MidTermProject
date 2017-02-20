package PACKAGE_NAME;

/**
 * Created by Student on 2/20/17.
 */
public class ReceiptClass {
  private double subtotal;
    private double saleTaxes;
    private double grandTotal;

    public ReceiptClass () {
        subtotal = 0.0;
        saleTaxes = .06;
        grandTotal = 0.0;

    }
    public ReceiptClass (double subtotal, double saleTaxes, double grandTotal) {
        subtotal = subtotal;
        saleTaxes = .06;
        grandTotal = grandTotal;

    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getSaleTaxes() {
        return saleTaxes;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setSubtotal(double subtotal) {

        this.subtotal = subtotal;
    }
    
    public void setSaleTaxes(double saleTaxes) {
        this.saleTaxes = .06;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
}
