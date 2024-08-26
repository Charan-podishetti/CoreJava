package com.evergent.corejava.charan.application4;

import java.util.Scanner;

public class CustomizationModuleImpl1 implements CustomizationModule1 {
    
    enum designCode {PRINT, EMBROIDERY}
    enum colorCode {RED, BLUE, GREEN, BLACK}
    enum subModule4 {D, Q, M}
    private ShirtOrder shirtOrder;

 // Static block
    static {
        System.out.println("Customization Module Loaded.");
    }
    
    public CustomizationModuleImpl1(ShirtOrder shirtOrder) {
        this.shirtOrder = shirtOrder;
    }

    @Override
    public void displayMenu() {
        System.out.println("Customization Module");
        System.out.println("======================");
        System.out.println("D - To choose design options");
        System.out.println("Q - To choose color options");
        System.out.println("M - Return to Main Menu");
        System.out.println("=======================");
    }

    @Override
    public void handleInput(String input) {
        switch (subModule4.valueOf(input)) {
            case D:
                chooseDesign();
                break;
            case Q:
                chooseColor();
                break;
            default:
                break;
        }
    }

    @Override
    public void chooseDesign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Design Code \t Description \t Additional Charge");
        System.out.println("======================");
        System.out.println("PRINT \t Printed Design \t RM30.00");
        System.out.println("EMBROIDERY \t Embroidery \t RM50.00");
        System.out.println("======================");
        System.out.println("Enter your Design code (PRINT, EMBROIDERY): ");
        String selectedDesign = designCode.valueOf(scanner.nextLine()).name();
        if (selectedDesign.equals("PRINT")) {
            shirtOrder.setAdditionalItemCost(shirtOrder.getAdditionalItemCost() + 30);
        } else if (selectedDesign.equals("EMBROIDERY")) {
            shirtOrder.setAdditionalItemCost(shirtOrder.getAdditionalItemCost() + 50);
        }
        System.out.println("You selected " + selectedDesign + " design. Additional cost: RM" + shirtOrder.getAdditionalItemCost());
    }

    @Override
    public void chooseColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Color Code \t Description");
        System.out.println("======================");
        System.out.println("RED \t Red Color");
        System.out.println("BLUE \t Blue Color");
        System.out.println("GREEN \t Green Color");
        System.out.println("BLACK \t Black Color");
        System.out.println("======================");
        System.out.println("Enter your Color code (RED, BLUE, GREEN, BLACK): ");
        String selectedColor = colorCode.valueOf(scanner.nextLine()).name();
        System.out.println("You selected " + selectedColor + " color.");
    }
}
