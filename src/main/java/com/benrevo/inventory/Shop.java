package com.benrevo.inventory;
import java.util.*;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;

public class Shop {
    Inventory backInventory = new Inventory("back");
    Inventory shopInventory = new Inventory("shop");


    //populate the inventory
    public Shop(String user) {
        MongoClientURI uri  = new MongoClientURI("mongodb://user:pass@host:port/db"); 
        MongoClient client = new MongoClient(uri);
        MongoDatabase db = client.getDatabase(uri.getDatabase());

        MongoCollection<Document> user = db.getCollection(username);
    }
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
