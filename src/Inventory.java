import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Warehouse> warehouses;

    public Inventory() {
        warehouses = new HashMap<>();
    }

    public void addWarehouse(String name) {
        if (!warehouses.containsKey(name)) {
            warehouses.put(name, new Warehouse(name));
            System.out.println("Warehouse added " + name);
        } else {
            System.out.println("Warehouse already exists");
        }
    }

    public void addItem(String warehouseName, Item item) {
        Warehouse warehouse = warehouses.get(warehouseName);
        if (warehouse != null) {
            warehouse.addItem(item);
        } else {
            System.out.println("Warehouse not found");
        }
    }

    public void removeItem(String warehouseName, String itemName) {
        Warehouse warehouse = warehouses.get(warehouseName);
        if (warehouse != null) {
            warehouse.removeItem(itemName);
        } else {
            System.out.println("Warehouse not found");
        }
    }

    public void updateItemQuantity(String warehouseName, String itemName, int newQuantity) {
        Warehouse warehouse = warehouses.get(warehouseName);
        if (warehouse != null) {
            warehouse.updateItemQuantity(itemName, newQuantity);
        } else {
            System.out.println("Warehouse not found");
        }
    }

    public void displayWarehouseItems(String warehouseName) {
        Warehouse warehouse = warehouses.get(warehouseName);
        if (warehouse != null) {
            warehouse.displayItems();
        } else {
            System.out.println("Warehouse not found");
        }
    }

    public void displayAllWarehouses() {
        if (warehouses.isEmpty()) {
            System.out.println("No warehouses found");
        } else {
            System.out.println("Warehouses in system");
            for (String name : warehouses.keySet()) {
                System.out.println(" - " + name);
            }
        }
    }
}
