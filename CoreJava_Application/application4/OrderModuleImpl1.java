package com.evergent.corejava.charan.application4;

import java.util.Scanner;

public class OrderModuleImpl1 implements OrderModule {
    private ShirtOrder shirtOrder;
    
    enum subModule1 {F, S, M}
	enum menuCode {A, B, C, D}
	enum shirtSize {S, M, L, XL}
	enum shirtStyle {INDIA, USA, UK, JAPAN}
	
      int menuItemCost;
      int numberOfShirts;
      int amountDisc;
      int additionalItemCost;
      String selectedSize;
      String selectedStyle;
      
    //static block.
      static {
      	System.out.println("Order module Loaded!..");
      }

    public OrderModuleImpl1(ShirtOrder shirtOrder) {
        this.shirtOrder = shirtOrder;
    }

    @Override
    public void displayMenu() {
        System.out.println("Order Module");
        System.out.println("======================");
        System.out.println("F - to place orders for shirts");
        System.out.println("S - to place for other services");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
    }

    @Override
    public void handleInput(String input) {
        switch (subModule1.valueOf(input)) {
            case F:
                placeOrder();
                break;
            case S:
                otherServices();
                break;
            default:
                break;
        }
    }

    @Override
    public void placeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu \t Description  \t Charge per head ");
        System.out.println("===============================================");
        System.out.println("A \t Formal Ware  \t\t\t RM400.00");
        System.out.println("B \t Casual Ware \t\t\t RM500.00");
        System.out.println("C \t Traditional Ware \t\t RM600.00");
        System.out.println("D \t Party Ware \t\t RM700.00");
        System.out.println("===============================================");
        System.out.println("Enter your Menu code (A,B,C,D): ");
        String menu = scanner.nextLine();
        int menuItemCost = 0;
        switch (menuCode.valueOf(menu)) {
            case A:
                menuItemCost = 400;
                break;
            case B:
                menuItemCost = 500;
                break;
            case C:
                menuItemCost = 600;
                break;
            case D:
                menuItemCost = 700;
                break;
            default:
                break;
        }

        shirtOrder.setMenuItemCost(menuItemCost);

        System.out.println("Enter the number of shirts");
        int numberOfShirts = Integer.parseInt(scanner.nextLine());
        shirtOrder.setNumberOfShirts(numberOfShirts);

        System.out.println("Enter your shirt size (S, M, L, XL): ");
        String selectedSize = shirtSize.valueOf(scanner.nextLine()).name();
        shirtOrder.setSelectedSize(selectedSize);

        System.out.println("Enter your shirt style (INDIA, USA, UK, JAPAN): ");
        String selectedStyle = shirtStyle.valueOf(scanner.nextLine()).name();
        shirtOrder.setSelectedStyle(selectedStyle);

        int amountDisc = calculateDiscount(menuItemCost * numberOfShirts);
        shirtOrder.setDiscountedAmount(amountDisc);

        System.out.println("Amount for ordered shirts after discount: RM" + amountDisc);
    }

    @Override
    public void otherServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Item \t Description  \t Charge per Unit ");
        System.out.println("========================================================================");
        System.out.println("1 \t Printed Shirts \t RM40.00 per shirt");
        System.out.println("2 \t Gifting Shirts \t RM20.00 per shirt");
        System.out.println("3 \t Expedited shipping \t RM30.00 per shirt");
        System.out.println("========================================================================");
        System.out.println("Enter your choice (1,2,3): ");
        int choice = Integer.parseInt(scanner.nextLine());

        int additionalItemCost = 0;
        switch (choice) {
            case 1:
                additionalItemCost = 40;
                break;
            case 2:
                additionalItemCost = 20;
                break;
            case 3:
                additionalItemCost = 30;
                break;
            default:
                break;
        }

        shirtOrder.setAdditionalItemCost(additionalItemCost);
        System.out.println("Your additional cost: RM " + additionalItemCost);
    }

    private int calculateDiscount(int amount) {
        int numberOfShirts = shirtOrder.getNumberOfShirts();
        if (numberOfShirts >= 1 && numberOfShirts <= 25)
            return amount;
        if (numberOfShirts >= 26 && numberOfShirts <= 50)
            return (int) (amount * 0.97);
        if (numberOfShirts >= 51 && numberOfShirts <= 100)
            return (int) (amount * 0.95);
        if (numberOfShirts >= 101 && numberOfShirts <= 200)
            return (int) (amount * 0.92);
        if (numberOfShirts >= 251)
            return (int) (amount * 0.90);
        return amount;
    }
}

