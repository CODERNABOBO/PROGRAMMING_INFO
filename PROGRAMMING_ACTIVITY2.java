//BEVERLY R. TARAY
//BIT122L-OBaL
// FEBRUARY 18, 2024


import java.util.Scanner;
class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class InventoryManagementSystem {
    Product[] products;
    int productCount;

    public InventoryManagementSystem(int maxSize) {
        products = new Product[maxSize];
        productCount = 0;
    }

    public void addProduct(Product newProduct) {
        if (productCount < products.length) {
            products[productCount++] = newProduct;
            System.out.println("Product added successfully");
        } else {
            System.out.println("Inventory is full, cannot add more products");
        }
    }

    public void updateProduct(String productName, double newPrice, int newQuantity) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].name.equals(productName)) {
                products[i].price = newPrice;
                products[i].quantity = newQuantity;
                System.out.println("Product updated successfully");
                return;
            }
        }
        System.out.println("Product not found in the inventory");
    }

    public void displayAllProducts() {
        for (int i = 0; i < productCount; i++) {
            System.out.println("Product: " + products[i].name +
                    ", Price: $" + products[i].price +
                    ", Quantity: " + products[i].quantity);
        }
    }

    public void searchProductByName(String productName) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].name.equals(productName)) {
                System.out.println("Product found - Name: " + products[i].name +
                        ", Price: $" + products[i].price +
                        ", Quantity: " + products[i].quantity);
                return;
            }
        }
        System.out.println("Product not found in the inventory");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate an object of the "InventoryManagementSystem" class
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem(10);

        // Add some sample products using the addProduct method
        System.out.println("Adding products:");
        addProductFromUserInput(scanner, inventorySystem);

        // Test the updateProduct method by updating the price and quantity of an existing product
        System.out.println("Updating product:");
        updateProductFromUserInput(scanner, inventorySystem);

        // Display all products using the displayAllProducts method
        System.out.println("All Products:");
        inventorySystem.displayAllProducts();

        // Test the searchProductByName method by searching for a product by name
        System.out.println("Searching for a product:");
        searchProductFromUserInput(scanner, inventorySystem);

        scanner.close();
    }

    private static void addProductFromUserInput(Scanner scanner, InventoryManagementSystem inventorySystem) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        inventorySystem.addProduct(new Product(name, price, quantity));
    }

    private static void updateProductFromUserInput(Scanner scanner, InventoryManagementSystem inventorySystem) {
        System.out.print("Enter the name of the product to update: ");
        String productName = scanner.nextLine();
        System.out.print("Enter the new price: ");
        double newPrice = scanner.nextDouble();
        System.out.print("Enter the new quantity: ");
        int newQuantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        inventorySystem.updateProduct(productName, newPrice, newQuantity);
    }

    private static void searchProductFromUserInput(Scanner scanner, InventoryManagementSystem inventorySystem) {
        System.out.print("Enter the name of the product to search: ");
        String productName = scanner.nextLine();

        inventorySystem.searchProductByName(productName);
    }
}