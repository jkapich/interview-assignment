package com.benrevo.inventory;

public class Shop {
    Inventory backInventory = new Inventory("back");
    Inventory shopInventory = new Inventory("shop");

    public boolean removeFromInventory(String name, String item) {
        return false;
    }

    public boolean updateInventory(String name, String item, int cost) {
        return false;
    }

    public boolean createInventory(String name){
        return false;
    }

    public void viewInventory(String name) {

    }

}
