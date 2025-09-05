class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed.");
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void displayDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 50000, 1);
        item1.displayDetails();
        item1.addItem(2);
        item1.displayDetails();
        item1.removeItem(1);
        item1.displayDetails();
    }
}
