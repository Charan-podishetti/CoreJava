package com.capg.shadow.service;

import com.capg.shadow.bean.ProductBean;
import com.capg.shadow.dao.InventoryDAO;

public class InventoryService {
    InventoryDAO inventoryDAO = new InventoryDAO();

    public int addProduct(int productId, String productName, int quantity, double price) {
        ProductBean product = new ProductBean();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setQuantity(quantity);
        product.setPrice(price);
        int result = inventoryDAO.addProduct(product);
        if (result != 0) {
            String transaction = "Product Added: " + productName + ", Quantity: " + quantity;
            inventoryDAO.logTransaction(productId, transaction);
        }
        return result;
    }

    public void showProductDetails(int productId) {
        ProductBean product = inventoryDAO.getProductDetails(productId);
        if (product != null) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Price: $" + product.getPrice());
        } else {
            System.out.println("Product not found!");
        }
    }

    public void addStock(int productId, int quantity) {
        ProductBean product = inventoryDAO.getProductDetails(productId);
        if (product != null) {
            int newQuantity = product.getQuantity() + quantity;
            inventoryDAO.updateStock(productId, newQuantity);
            String transaction = "Added Stock: " + quantity;
            inventoryDAO.logTransaction(productId, transaction);
        }
    }

    public void removeStock(int productId, int quantity) {
        ProductBean product = inventoryDAO.getProductDetails(productId);
        if (product != null) {
            int newQuantity = product.getQuantity() - quantity;
            if (newQuantity < 0) {
                System.out.println("Insufficient stock!");
            } else {
                inventoryDAO.updateStock(productId, newQuantity);
                String transaction = "Removed Stock: " + quantity;
                inventoryDAO.logTransaction(productId, transaction);
            }
        }
    }

    public void transferStock(int sourceId, int targetId, int quantity) {
        ProductBean sourceProduct = inventoryDAO.getProductDetails(sourceId);
        ProductBean targetProduct = inventoryDAO.getProductDetails(targetId);
        if (sourceProduct != null && targetProduct != null) {
            if (sourceProduct.getQuantity() < quantity) {
                System.out.println("Insufficient stock to transfer!");
            } else {
                int newSourceQuantity = sourceProduct.getQuantity() - quantity;
                int newTargetQuantity = targetProduct.getQuantity() + quantity;
                inventoryDAO.updateStock(sourceId, newSourceQuantity);
                inventoryDAO.updateStock(targetId, newTargetQuantity);
                String transaction = "Transferred " + quantity + " units from Product " + sourceId + " to Product " + targetId;
                inventoryDAO.logTransaction(sourceId, transaction);
                inventoryDAO.logTransaction(targetId, transaction);
            }
        }
    }

    public void viewTransactions(int productId) {
        String transactionHistory = inventoryDAO.getTransactionHistory(productId);
        System.out.println("Transaction History for Product ID " + productId + ":");
        System.out.println(transactionHistory);
    }
}