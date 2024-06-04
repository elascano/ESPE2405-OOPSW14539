

package ec.edu.espe.airlinereservationsystem.model;

import enums.PaymentMethod;
import java.util.Date;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Payment {
    private int paymentId;
    private PaymentMethod method;
    private double amount;
    private Date date;

    public Payment(int paymentId, PaymentMethod method, double amount, Date date) {
        this.paymentId = paymentId;
        this.method = method;
        this.amount = amount;
        this.date = date;
    }

    
    
    /**
     * @return the paymentId
     */
    public int getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * @return the method
     */
    public PaymentMethod getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    

}
