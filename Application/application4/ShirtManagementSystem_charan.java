package com.evergent.corejava.charan.application4;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class ShirtManagementSystem_charan {
    enum module1 {O, P, R, C, E}
    enum subModule1 {F, S, M}
    enum subModule2 {T, P, M}
    enum subModule3 {I, S, M}
    enum subModule4 {D, Q, M}
    enum menuCode {A, B, C, D}
    enum shirtSize {S, M, L, XL}
    enum shirtStyle {INDIA, USA, UK, JAPAN}
    enum designCode {PRINT, EMBROIDERY}
    enum colorCode {RED, BLUE, GREEN, BLACK}

    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ShirtOrder shirtOrder=new ShirtOrder();
        
        Module1 orderModule = new OrderModuleImpl1(shirtOrder);
        PaymentModuleImpl1 paymentModule = new PaymentModuleImpl1(shirtOrder);
        Module1 reportModule = new ReportModuleImpl1(shirtOrder);
        Module1 customizationModule = new CustomizationModuleImpl1(shirtOrder);

        
        //System.out.println("\n\t\t \t\t Welcome To SHIRT MANAGEMENT SYSTEM");

        while (true) {
            System.out.println("======================");
            System.out.println("SMS Main Menu");
            System.out.println("======================");
            System.out.println("O - Order Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("C - Customization Module");
            System.out.println("E - Quit Module");
            System.out.println("======================");
            System.out.println("Enter your Module code (O,P,R,C,E): ");

            //Scanner scanner = new Scanner(System.in);
            String module = scanner.nextLine().trim().toUpperCase();
            switch (module1.valueOf(module)) {
                case O:
                    orderModule.displayMenu();
                    String orderInput=scanner.nextLine().trim().toUpperCase();
                    orderModule.handleInput(orderInput);
                    break;
                case P:
                    paymentModule.displayMenu();
                    String paymentInput=scanner.nextLine().trim().toUpperCase();
                    paymentModule.handleInput(paymentInput);
                    
                    break;
                case R:
                    reportModule.displayMenu();
                    String reportInput=scanner.nextLine().trim().toUpperCase();
                    reportModule.handleInput(reportInput);
                    break;
                case C:
                    customizationModule.displayMenu();
                    String customizationInput=scanner.nextLine().trim().toUpperCase();
                    customizationModule.handleInput(customizationInput);
                    break;
                case E:
                    System.out.println("Quit Module");
                    System.exit(0);
                    scanner.close();
                    break;
               default:
            	   System.out.println("Invalid Module code, please try again.");
            }
        }
    }
}