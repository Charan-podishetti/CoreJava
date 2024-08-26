package com.evergent.corejava.charan.application4;
public class ReportModuleImpl1 implements ReportModule {
    private ShirtOrder shirtOrder;
    
    enum subModule3 {
		I, S, M
	}

	 int numberOfShirts;
	 int amount;
	 int additionalItemCost;
	 int amountDisc;
	 String selectedSize;
	 String selectedStyle;
	 
	// static
		static {
			System.out.println("Report Module Loaded!..");
		}

    public ReportModuleImpl1(ShirtOrder shirtOrder) {
        this.shirtOrder = shirtOrder;
    }

    @Override
    public void displayMenu() {
        System.out.println("Report Module");
        System.out.println("======================");
        System.out.println("I - to display invoice for order mode");
        System.out.println("S - to display the summary of orders and payments made");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
    }

    @Override
    public void handleInput(String input) {
        switch (subModule3.valueOf(input)) {
            case I:
                displayInvoice();
                break;
            case S:
                displaySummary();
                break;
            default:
                break;
        }
    }

    @Override
    public void displayInvoice() {
        System.out.println("Invoice");
        System.out.println("======================");
        System.out.println("Shirt Size: " + shirtOrder.getSelectedSize());
        System.out.println("Shirt Style: " + shirtOrder.getSelectedStyle());
        System.out.println("Number of Shirts: " + shirtOrder.getNumberOfShirts());
        System.out.println("Total Amount: RM" + (shirtOrder.getDiscountedAmount() + shirtOrder.getAdditionalItemCost()));
        System.out.println("======================");
    }

    @Override
    public void displaySummary() {
        System.out.println("Order Summary");
        System.out.println("======================");
        System.out.println("Shirt Size: " + shirtOrder.getSelectedSize());
        System.out.println("Shirt Style: " + shirtOrder.getSelectedStyle());
        System.out.println("Number of Shirts: " + shirtOrder.getNumberOfShirts());
        System.out.println("Discounted Amount: RM" + shirtOrder.getDiscountedAmount());
        System.out.println("Additional Costs: RM" + shirtOrder.getAdditionalItemCost());
        System.out.println("Total Amount Paid: RM" + (shirtOrder.getDiscountedAmount() + shirtOrder.getAdditionalItemCost()));
        System.out.println("======================");
    }
}

