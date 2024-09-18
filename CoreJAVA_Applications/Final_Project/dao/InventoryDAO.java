package com.evergent.shadow.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.capg.shadow.bean.ProductBean;

public class InventoryDAO {

    Connection con = null;
    PreparedStatement pstmt = null;

    public int addProduct(ProductBean product) {
        try {
            con = InventoryDBConnection.getConnection();
            String insertQuery = "INSERT INTO inventory (product_id, product_name, quantity, price) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(insertQuery);
            pstmt.setInt(1, product.getProductId());
            pstmt.setString(2, product.getProductName());
            pstmt.setInt(3, product.getQuantity());
            pstmt.setDouble(4, product.getPrice());
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }

    public ProductBean getProductDetails(int productId) {
        try {
            ProductBean product = new ProductBean();
            con = InventoryDBConnection.getConnection();
            String query = "SELECT * FROM inventory WHERE product_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                product.setProductId(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setQuantity(rs.getInt("quantity"));
                product.setPrice(rs.getDouble("price"));
            }
            con.close();
            return product;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public int updateStock(int productId, int quantity) {
        try {
            con = InventoryDBConnection.getConnection();
            String updateQuery = "UPDATE inventory SET quantity = ? WHERE product_id = ?";
            pstmt = con.prepareStatement(updateQuery);
            pstmt.setInt(1, quantity);
            pstmt.setInt(2, productId);
            int result = pstmt.executeUpdate();
            con.close();
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public void logTransaction(int productId, String transactionDetails) {
        try {
            con = InventoryDBConnection.getConnection();
            String logQuery = "INSERT INTO transactions (product_id, transaction_details) VALUES (?, ?)";
            pstmt = con.prepareStatement(logQuery);
            pstmt.setInt(1, productId);
            pstmt.setString(2, transactionDetails);
            pstmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public String getTransactionHistory(int productId) {
        StringBuilder transactionHistory = new StringBuilder();
        try {
            con = InventoryDBConnection.getConnection();
            String query = "SELECT transaction_details FROM transactions WHERE product_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                transactionHistory.append(rs.getString(1)).append("\n");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return transactionHistory.toString();
    }
}