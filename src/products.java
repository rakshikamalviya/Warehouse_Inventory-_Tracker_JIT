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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getReorderThreshold() {
        return reorderThreshold;
    }

public synchronized void increaseQuantity(int amount) {
    if (amount < 0) {
        throw new IllegalArgumentException("Amount must be non-negative");
    }
    this.quantity += amount;
}

public synchronized void decreaseQuantity(int amount) {
    if (amount < 0) {
        throw new IllegalArgumentException("Amount must be non-negative");
    }
    if (amount > this.quantity) {
        throw new IllegalArgumentException("Insufficient stock available");
    }
    this.quantity -= amount;
}

@Override
public String toString() {
    return String.format(
        "Products[id=%d, name=%s, quantity=%d, threshold=%d]",id, name, quantity, reorderThreshold
    );
}

}
