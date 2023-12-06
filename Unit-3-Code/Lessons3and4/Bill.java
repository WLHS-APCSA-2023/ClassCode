public class Bill {
    private double costOfMeal;
    private int totalCustomers;

    public Bill(double totalBill, int numCustomers) {
        costOfMeal = totalBill;
        totalCustomers = numCustomers;
    }

    public void addTip() {

        if (totalCustomers >= 8) {
            costOfMeal *= 1.25;
        } else if (totalCustomers >= 4) {
            costOfMeal *= 1.2;
        }
    }

    public void addTipTwo() {
        if(totalCustomers >= 8) {
            costOfMeal *= 1.25;
            return;
            }
            if(totalCustomers >= 4) costOfMeal *= 1.20;
    }

    public void tipSwitch(){
        switch (totalCustomers){
            case 10 , 9 , 8:
                costOfMeal *= 1.25;
                break;
            case 7:
            case 6:
            case 5:
                costOfMeal *= 1.2;
                break;
            default:
                costOfMeal *= 1.05;
        }
    }

    public String toString() {
        return "Your bill is $" + costOfMeal;
    }
}
