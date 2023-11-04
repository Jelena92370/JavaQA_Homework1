import java.util.Scanner;

public class TestStorageSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input tech product name :");
        String techname = scanner.next();
        TechProduct techProduct = new TechProduct();
        techProduct.setName(techname);

        System.out.println("Input food product name :");
        String foodname = scanner.next();
        FoodProduct foodProduct = new FoodProduct();
        foodProduct.setName(foodname);

        System.out.println("Input book product name :");
        String bookname = scanner.next();
        BookProduct bookProduct = new BookProduct(bookname);

        Truck truck = new Truck();
        truck.loadProductToTruck(techProduct);
        truck.loadProductToTruck(foodProduct);
        truck.loadProductToTruck(bookProduct);

        System.out.println("All products in truck : ");
        truck.printAllProductsFromTruck();

        System.out.println("Track is loaded and ready to go");

        Storage storage = new Storage();

           for (int i = 0; i < 5; i++) {
            Product product = truck.unloadProductFromTruck();
            if (product == null) {
                break;
            }
            storage.loadProductToStorage(product);
        }

        System.out.println("All product in storage :");
        storage.printAllProductsFromStorage();

        loadTruck(truck, new Product[]{techProduct, foodProduct, bookProduct});
        unloadTruckToStorage(storage, truck);
    }
    private static void loadTruck(Truck truck, Product[] products) {
        for (Product product : products) {
            truck.loadProductToTruck(product);
        }
    }

    private static void unloadTruckToStorage(Storage storage, Truck truck) {
        while (true) {
            Product product = truck.unloadProductFromTruck();
            if (product == null) {
                break;
            }
            storage.loadProductToStorage(product);
        }
    }
}





