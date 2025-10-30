
public class Products {
    private int id;
    private String name;
    private int quantity;
    private int reorderThreshold;

    public Products(int id, String name, int quantity, int reorderThreshold) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.reorderThreshold = reorderThreshold;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public int getReorderThreshold() { return reorderThreshold; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isLowStock() {
        return quantity < reorderThreshold;
    }

    @Override
    public String toString() {
        return "Products[ID=" + id + ", Name=" + name + ", Quantity=" + quantity + ", Threshold=" + reorderThreshold + "]";
    }
}
