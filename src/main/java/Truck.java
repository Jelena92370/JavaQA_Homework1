public class Truck {
    private Product[] products = new Product[5];

    private int counter = 0;

    public void loadProductToTruck(Product product) {
        products[counter] = product;
        counter++;
    }

    public void printAllProductsFromTruck() {
        for (int i = 0; i < counter; i++) {
            System.out.println("Product = " + products[i]);
        }
    }

    public Product unloadProductFromTruck() {
        if (counter == 0) {
            System.out.println("Track is empty");
            return null;
        }

        Product currentProduct = products[counter - 1];
        products[counter - 1] = null;
        counter--;

        return currentProduct;
    }


}
