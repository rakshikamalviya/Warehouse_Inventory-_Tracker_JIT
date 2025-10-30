import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWAREHOUSE INVENTORY TRACKER");
            System.out.println("1. Add Product");
            System.out.println("2. Receive Shipment");
            System.out.println("3. Fulfill Order");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Reorder Threshold: ");
                    int threshold = sc.nextInt();
                    warehouse.addProduct(id, name, qty, threshold);
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();
                    System.out.print("Enter Quantity to Receive: ");
                    qty = sc.nextInt();
                    warehouse.receiveShipment(id, qty);
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();
                    System.out.print("Enter Quantity to Fulfill: ");
                    qty = sc.nextInt();
                    warehouse.fulfillOrder(id, qty);
                    break;

                case 4:
                    warehouse.showInventory();
                    break;

                case 5:
                    System.out.println("Exiting system... 👋");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
