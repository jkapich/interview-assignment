package com.benrevo.inventory;

import java.util.*;

public class Inventory {
    String name;
    HashMap<String, Item> inventory = new HashMap<String, Item>();

    public Inventory(String name) {
        this.name = name;
    }
    public boolean removeFromInventory(String itemName) {
        if (inventory.containsKey(itemName)) {
            inventory.remove(itemName);
            return true;
        }
        return false;

    }

    //update cost of item
    public boolean updateInventory(String itemName, double cost) {
        Item tempItem = inventory.get(itemName);
        if (tempItem != null) {
            tempItem.updateCost(cost);
            inventory.put(itemName, tempItem);
            return true;
        } else {
            tempItem = new Item(itemName, cost);
            inventory.put(itemName, tempItem);
            return true;
        }


    }

    public void viewInventory() {
        HashMap<String, Item> tempInventory = new HashMap<String, Item>();
        inventory.forEach(tempInventory::putIfAbsent);
        Iterator it = inventory.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " is $" + pair.getValue());
        }
    }
    public HashMap<String,Item> getInventory(){
        return inventory;
    }


}
