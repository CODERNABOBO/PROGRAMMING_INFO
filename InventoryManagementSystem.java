import java.util.Scanner;

public class InventoryManagementSystem {
    private static final int MAX_PRODUCTS = 100;
    private static String[] productNames = new String[MAX_PRODUCTS];
    private static double[] productPrices = new double[MAX_PRODUCTS];
    private static int[] productQuantities = new int[MAX_PRODUCTS];
    private static int size = 0;
    private static Scanner scanner = new Scanner(System.in);

    // Method to add a new product
    public static void addProduct() {
        if (size < MAX_PRODUCTS) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
          

	 //Enter your code Here

            System.out.println("Product added successfully: " + name);
        } else {
            System.out.println("Error: Maximum number of products reached.");
        }
    }

    // Method to update product information
    public static void updateProduct() {
        System.out.print("Enter product name to update: ");
        String productName = scanner.nextLine();
        for (int i = 0; i < size; i++) {
            if (productNames[i].equals(productName)) {
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();
                System.out.print("Enter new quantity: ");
                int newQuantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                //Enter your code Here
            }
        }
        System.out.println("Error: Product not found.");
    }

    // Method to display all products
    public static void displayAllProducts() {
        System.out.println("Inventory:");

         //Enter your code Here
    }

    // Method to search for a product by name
    public static void searchProductByName() {
        System.out.print("Enter product name to search: ");
        String productName = scanner.nextLine();

         //Enter your code Here

        System.out.println("Error: Product not found.");
    }

    // Main method to test the Inventory Management System
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Search Product by Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    displayAllProducts();
                    break;
                case 4:
                    searchProductByName();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}