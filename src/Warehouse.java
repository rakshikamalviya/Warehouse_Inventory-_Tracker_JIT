public class Warehouse {
    private Inventory inventory;
    private Alert alertService;
    private EventLogger logger;

    public Warehouse() {
        this.inventory = new Inventory();
        this.alertService = new Alert();
        this.logger = new EventLogger();
    }

    public void addProduct(int id, String name, int qty, int threshold) {
        Products prod = new Products(id, name, qty, threshold);
        inventory.addProduct(prod);
        logger.log("Product added: " + name + " (Qty: " + qty + ")");
    }

    public void receiveShipment(int productId, int qty) {
        Products prod = inventory.getProduct(productId);
        if (prod == null) {
            System.out.println("Product not found!");
            return;
        }

        prod.setQuantity(prod.getQuantity() + qty);
        logger.log("Received shipment for " + prod.getName() + ": +" + qty + " units");
        System.out.println("Updated stock: " + prod.getQuantity());
    }

    public void fulfillOrder(int productId, int qty) {
        Products prod = inventory.getProduct(productId);
        if (prod == null) {
            System.out.println("Product not found!");
            return;
        }

        if (prod.getQuantity() < qty) {
            System.out.println("Insufficient stock for " + prod.getName());
            return;
        }

        prod.setQuantity(prod.getQuantity() - qty);
        logger.log("Order fulfilled for " + prod.getName() + ": -" + qty + " units");
        System.out.println("Remaining stock " + prod.getQuantity());

        if (prod.isLowStock()) {
            alertService.triggerLowStockAlert(prod);
            logger.log("Low stock alert triggered for " + prod.getName());
        }
    }

    public void showInventory() {
        inventory.displayAll();
    }
}
