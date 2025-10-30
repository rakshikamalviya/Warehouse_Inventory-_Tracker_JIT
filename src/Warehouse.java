import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int choice;

    do {
            System.out.println("Warehouse Inventory Tracker");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Check Reorder Alerts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    System.out.print("Enter Reorder Threshold: ");
                    int threshold = scanner.nextInt();

                    Product newProduct = new Product(id, name, quantity, threshold);
                    inventory.addProduct(newProduct);
                    break;

                case 2:
                    System.out.print("Enter Product ID to Remove: ");
                    int removeId = scanner.nextInt();
                    inventory.removeProduct(removeId);
                    break;

                case 3:
                    inventory.displayAllProducts();
                    break;

                case 4:
                    inventory.checkReorderAlerts();
                    break;

                case 5:
                    System.out.println("Exiting...Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        scanner.close()
 }
}