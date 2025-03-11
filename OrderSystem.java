import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to use kiosk?");
        String input = sc.nextLine();
        boolean isKiosk = input.equalsIgnoreCase("Yes") ? true : false;
        OrderProcessor order = new OrderProcessor();

        System.out.println("Do you want a takeaway or dinein?");
        String type = sc.nextLine();

        System.out.println("What is your order?");
        String item = sc.nextLine();

        double bill = 0.0;
        if(isKiosk){
            bill = order.processKioskOrder(type, item);
        } else {
            bill = order.processManualOrder(type, item);
        }
        
        PaymentProcessor payment = new PaymentProcessor();
        System.out.println("Please pay the bill of $" + bill);
        double cash = sc.nextDouble();
        payment.handlePayment(cash, bill);

        sc.close();
    }
}