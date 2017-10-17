package com.benrevo.inventory;

public class Item {
    //for now Items only have basic features: name and cost
    String name;
    double cost;

    public Item(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public void updateName(String newName) {
        name = newName;
    }

    public void updateCost(double newCost) {
        this.cost = newCost;
    }

    public String getName() {return name;}
    public double getCost() {return cost;}

    public void printItem() {
        System.out.println("Name: " + name + ", cost = " + cost);
    }
}
