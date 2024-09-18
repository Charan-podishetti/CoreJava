package com.evergent.shadow.controller;


import java.util.Scanner;

import com.evergent.shadow.service.InventoryService;

public class InventoryController {
    public static void main(String[] args) {
        int productId = 0;
        String productName = "";
        int productQuantity = 0;
        double productPrice = 0.0;
        int choice, continueChoice = 1;
        Scanner scanner = new Scanner(System.in);

        InventoryService inventoryService = new InventoryService();

        while (continueChoice != 0) {
            System.out.println("1. Add a New Product");
            System.out.println("2. Show Product Details");
            System.out.println("3. Add Stock");
            System.out.println("4. Remove Stock");
            System.out.println("5. Transfer Stock");
            System.out.println("6. View Transaction History");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Product ID:");
                    productId = scanner.nextInt();
                    System.out.println("Enter Product Name:");
                    productName = scanner.next();
                    System.out.println("Enter Initial Quantity:");
                    productQuantity = scanner.nextInt();
                    System.out.println("Enter Product Price:");
                    productPrice = scanner.nextDouble();
                    int result = inventoryService.addProduct(productId, productName, productQuantity, productPrice);
                    System.out.println(result + " Product Added Successfully");
                    break;
                    
                case 2:
                    System.out.println("Enter Product ID:");
                    int pId = scanner.nextInt();
                    inventoryService.showProductDetails(pId);
                    break;

                case 3:
                    System.out.println("Enter Product ID to add stock:");
                    pId = scanner.nextInt();
                    System.out.println("Enter Quantity to add:");
                    int addQuantity = scanner.nextInt();
                    inventoryService.addStock(pId, addQuantity);
                    break;

                case 4:
                    System.out.println("Enter Product ID to remove stock:");
                    pId = scanner.nextInt();
                    System.out.println("Enter Quantity to remove:");
                    int removeQuantity = scanner.nextInt();
                    inventoryService.removeStock(pId, removeQuantity);
                    break;

                case 5:
                    System.out.println("Enter Source Product ID:");
                    int sourceId = scanner.nextInt();
                    System.out.println("Enter Target Product ID:");
                    int targetId = scanner.nextInt();
                    System.out.println("Enter Quantity to Transfer:");
                    int transferQuantity = scanner.nextInt();
                    inventoryService.transferStock(sourceId, targetId, transferQuantity);
                    break;

                case 6:
                    System.out.println("Enter Product ID to view transactions:");
                    pId = scanner.nextInt();
                    inventoryService.viewTransactions(pId);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

            System.out.println("\nEnter 1 to perform more operations, 0 to exit:");
            continueChoice = scanner.nextInt();
        }

        scanner.close();
    }
}

