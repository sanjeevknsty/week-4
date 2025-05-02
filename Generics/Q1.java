import java.util.ArrayList;
import java.util.Arrays;

abstract class WarehouseItem{
    private int itemId ;
    private String itemName;
    private int itemQuantity;
    private double itemPrice;

    public WarehouseItem(int itemId, String itemName, int itemQuantity, double itemPrice) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.itemQuantity = itemQuantity;
            this.itemPrice = itemPrice;
        }
    public String getName(){
        return this.itemName;
    }
    public int getItemQuantity(){
        return this.itemQuantity;
    }
    public int getItemId(){
        return this.itemId;
    }
    public double getItemPrice(){
        return this.itemPrice;
    }

}

class Electronics extends WarehouseItem {
    public Electronics(int itemId, String itemName, int itemQuantity, double itemPrice) {
        super(itemId, itemName, itemQuantity, itemPrice);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(int itemId, String itemName, int itemQuantity, double itemPrice) {
        super(itemId, itemName, itemQuantity, itemPrice);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(int itemId, String itemName, int itemQuantity, double itemPrice) {
        super(itemId, itemName, itemQuantity, itemPrice);
    }
}

class WareHouse{
    public static void displayItems(ArrayList<? extends WarehouseItem> arr){
        for(WarehouseItem item : arr){
            System.out.println("Id : " + item.getItemId());
            System.out.println("Name : " + item.getName());
            System.out.println("Quantity : " +  item.getItemQuantity());
            System.out.println("Price : " + item.getItemPrice());
            System.out.println("******************");
        }
    }
}


class Storage <T extends  WarehouseItem>{

        ArrayList<T> items = new ArrayList<>();
    public void addItem(T item){
        items.add(item);
    }
    public ArrayList<T> getItems(){
        return this.items;
    }
}

public class Q1 {
    public static void main(String[] args) {
           Storage<Electronics> electronics = new Storage<>();
           electronics.addItem(new Electronics(123,"Laptop",10,10000));
           electronics.addItem(new Electronics(124,"Mobile",10,9999));
        System.out.println("Electronics");
        WareHouse.displayItems(electronics.getItems());

           Storage<Groceries> groceries = new Storage<>();
           groceries.addItem((new Groceries(1,"Rice",5,100)));
           groceries.addItem((new Groceries(2,"Wheat",5,120)));
        System.out.println("Groceries");

        WareHouse.displayItems(groceries.getItems());

           Storage<Furniture> furniture = new Storage<>();
           furniture.addItem((new Furniture(1,"Table",5,1000)));
           furniture.addItem((new Furniture(2,"Chair",5,1200)));
        System.out.println("Furniture");
           WareHouse.displayItems(furniture.getItems());
    }
}
