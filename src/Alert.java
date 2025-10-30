public class Alert {
    public void triggerLowStockAlert(Products prod) {
        System.out.println(" ALERT: Low stock for " + prod.getName() + " – only " + prod.getQuantity() + " left!");
    }
}
