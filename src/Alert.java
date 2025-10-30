public class Alert {

    public void sendLowStockAlert(Product product) {
        System.out.println("ALERT: Product '" + product.getName() + "' (ID: " + product.getId() + 
                           ") is below its reorder threshold");
        System.out.println("Current Quantity: " + product.getQuantity() + 
                           " | Threshold: " + product.getReorderThreshold());
        System.out.println("---------------------------------------------");
    }
}
