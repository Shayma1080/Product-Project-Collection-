package be.intecbrussel.project.collection;

public class ProductApp {
    public static void main(String[] args) {
        ProductSorter sorter = new ProductSorter();
        ProductFactory factory = new ProductFactory(sorter);
        factory.createProducts(101);

        System.out.println("Food products: " + sorter.getFoodProducts().size());
        System.out.println("Health products: " +sorter.getHealthProducts().size());
        System.out.println("Electric products: " + sorter.getElectricProducts().size());
    }
}
