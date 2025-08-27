import java.util.HashMap;
import java.util.Map;

public class NewGroceryListManager {
    private HashMap<String, Double> groceryList;

    public NewGroceryListManager() {
        groceryList = new HashMap<>();
    }

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        System.out.println("Grocery List:");
        int index = 1;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(index + ". " + entry.getKey() + " - $" + entry.getValue());
            index++;
        }
        System.out.println();
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }

    public static void main(String[] args) {
        NewGroceryListManager manager = new NewGroceryListManager();

        manager.addItem("Apples", 2.50);
        manager.addItem("Milk", 1.80);
        manager.addItem("Bread", 2.20);

        manager.displayList();

        String itemToCheck = "Milk";
        System.out.println("Is \"" + itemToCheck + "\" in the grocery list? " + manager.checkItem(itemToCheck));
        System.out.println();

        System.out.println("Removing \"" + itemToCheck + "\" from the list...\n");
        manager.removeItem(itemToCheck);

        manager.displayList();

        System.out.println("Total cost of groceries: $" + manager.calculateTotalCost());
    }
}

