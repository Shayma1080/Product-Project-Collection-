package be.intecbrussel.project.collection;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Appel",20);
        ProductSorter sorter = new ProductSorter();
        ProductFactory factory = new ProductFactory(sorter);
        factory.createProducts(20);
    }
}
