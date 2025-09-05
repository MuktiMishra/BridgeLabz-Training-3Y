class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemInventory {
    public static void main(String[] args) {
        Item item1 = new Item(501, "Laptop", 55000);
        item1.displayDetails();
        int quantity = 2;
        System.out.println("Total cost for " + quantity + " items: " + item1.calculateTotalCost(quantity));
    }
}
