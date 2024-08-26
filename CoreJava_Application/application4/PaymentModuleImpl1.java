
package com.evergent.corejava.charan.application4;
public class PaymentModuleImpl1 implements PaymentModule {
    private ShirtOrder shirtOrder;
    
    enum subModule2 {T, P, M}
	
    int amount;
    int additionalItemCost;
  //static
    static {
    	System.out.println("Payment Module is created!..");
    }
    
    public PaymentModuleImpl1(ShirtOrder shirtOrder) {
        this.shirtOrder = shirtOrder;
    }

    @Override
    public void displayMenu() {
        System.out.println("Payment Module");
        System.out.println("======================");
        System.out.println("T - to display total amount to be paid");
        System.out.println("P - to make payment");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
    }

    @Override
    public void handleInput(String input) {
        switch (subModule2.valueOf(input)) {
            case T:
                displayTotalAmount();
                break;
            case P:
                makePayment();
                break;
            default:
                break;
        }
    }

    @Override
    public void displayTotalAmount() {
        int totalAmount = shirtOrder.getDiscountedAmount() + shirtOrder.getAdditionalItemCost();
        System.out.println("Total Amount to be Paid: RM" + totalAmount);
    }

    @Override
    public void makePayment() {
        int totalAmount = shirtOrder.getDiscountedAmount() + shirtOrder.getAdditionalItemCost();
        System.out.println("Payment Completed for Amount: RM" + totalAmount);
    }
}




