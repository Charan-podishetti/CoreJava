package com.evergent.corejava.charan.application4;

public class ShirtOrder {
    private String selectedSize;
    private String selectedStyle;
    private int numberOfShirts;
    private int menuItemCost;
    private int additionalItemCost;
    private int discountedAmount;

    // Getters and Setters
    public String getSelectedSize() {
        return selectedSize;
    }

    public void setSelectedSize(String selectedSize) {
        this.selectedSize = selectedSize;
    }

    public String getSelectedStyle() {
        return selectedStyle;
    }

    public void setSelectedStyle(String selectedStyle) {
        this.selectedStyle = selectedStyle;
    }

    public int getNumberOfShirts() {
        return numberOfShirts;
    }

    public void setNumberOfShirts(int numberOfShirts) {
        this.numberOfShirts = numberOfShirts;
    }

    public int getMenuItemCost() {
        return menuItemCost;
    }

    public void setMenuItemCost(int menuItemCost) {
        this.menuItemCost = menuItemCost;
    }

    public int getAdditionalItemCost() {
        return additionalItemCost;
    }

    public void setAdditionalItemCost(int additionalItemCost) {
        this.additionalItemCost = additionalItemCost;
    }

    public int getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(int discountedAmount) {
        this.discountedAmount = discountedAmount;
    }
}