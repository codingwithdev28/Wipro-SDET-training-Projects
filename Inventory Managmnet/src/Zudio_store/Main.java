package Zudio_store;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("👤 Username: ");
        String username = sc.nextLine();
        System.out.print("🔒 Password: ");
        String password = sc.nextLine();

        if (!LoginService.login(username, password)) {
            System.out.println("❌ Login failed. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n Inventory Management List");
            System.out.println("1. Add product");
            System.out.println("2. Update new Stock");
            System.out.println("3. View Inventory");
            System.out.println("4. Search with Category");
            System.out.println("5. Search with size");
            System.out.println("6. Generate Billing");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> Product.addProduct(sc);
                case 2 -> StockService.addStock();
                case 3 -> StockService.viewInventory(sc);
                case 4 -> SearchService.searchByCategory(sc);
                case 5 -> SearchService.searchBySize(sc);
                case 6 -> BillingService.generateBill(sc);
                case 7 -> {
                    System.out.println("🔚 Goodbye!");
                    return;
                }
                default -> System.out.println("❓ Invalid option");
            }
        }
    }

}
