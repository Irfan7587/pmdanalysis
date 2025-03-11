public class OrderProcessor implements OrderOperations{
  
    public double processKioskOrder(String type, String item){
        System.out.println("Processing kiosk order");
        double cost = 0.0;
        if(item.equalsIgnoreCase("drink")) {
            cost = 5.0;
        } else if(item.equalsIgnoreCase("dessert")) {
            cost = 10.0;
        } else if(item.equalsIgnoreCase("hotfood")) {
            cost = 13.0;
        }
        return cost;
    }


    public double processManualOrder(String type, String item){
        System.out.println("Processing manual order");
        if(type.equalsIgnoreCase("Takeaway")){
            assignToken();
        } else {
            assignTable();
        }
        double cost = 0.0;
        if(item.equalsIgnoreCase("drink")) {
            cost = 5.0;
        } else if(item.equalsIgnoreCase("dessert")) {
            cost = 10.0;
        } else if(item.equalsIgnoreCase("hotfood")) {
            cost = 13.0;
        }
        return cost;
    }

    @Override
    public void assignToken() {
        System.out.println("Assigning token number: " + (int)(Math.random() * 1000));
    }

    @Override
    public void assignTable() {
        System.out.println("Assigning table number: " + (int)(Math.random() * 10));
    }

    @Override
    public void manageInventory() {
        System.out.println("Inventory management is completed");
    }
}