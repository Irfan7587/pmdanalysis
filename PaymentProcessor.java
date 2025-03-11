public class PaymentProcessor {
    private CashPayment payment = new CashPayment();
    
    public void handlePayment(double amount, double bill) {
        double balance = payment.processCash(amount, bill);
        System.out.println("Processed $" + bill + ". Please collect change of $" + balance);
    }
}