public class CashPayment {
    public double processCash(double amount, double bill) {
        System.out.println("Accepting cash: $" + amount);
        double bal = amount - bill;
        return Math.round(bal * 100.0) / 100.0;
    }
}