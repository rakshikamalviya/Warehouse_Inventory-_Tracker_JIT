import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Products> productsList = new HashMap<>();

    public void addProduct(Products prod) {
        if (productsList.containsKey(prod.getId())) {
            System.out.println("Product ID already exists");
        } else {
            productsList.put(prod.getId(), prod);
            System.out.println( "Product added: " + prod.getName());
        }
    }

    public Products getProduct(int id) {
        return productsList.get(id);
    }

    public void displayAll() {
        System.out.println("\nInventory List");
        for (Products prod : productsList.values()) {
            System.out.println(prod);
        }
    }
}

