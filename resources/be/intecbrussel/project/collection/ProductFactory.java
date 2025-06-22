package be.intecbrussel.project.collection;

import java.util.*;

public class ProductFactory {
    Random random = new Random();
    private ProductSorter productSorter;
    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private  String[] electricProduct  = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    public void createProducts(int amount) {
        List<Product> product = new ArrayList<>();
        for(int i = 0; i< amount; i++) {
            int categoerie = random.nextInt(3); // random list
            int randomId = random.nextInt(151); // random ID
            switch (categoerie) {
                case 0 -> {
                    String name = foodProducts[random.nextInt(foodProducts.length)];
                    productSorter.sortProduct(new FoodProduct(name,randomId));
                }
                case 1 -> {
                    String name = healthProducts[random.nextInt(healthProducts.length)];
                    productSorter.sortProduct(new HealthProduct(name,randomId));
                }
                case 2 -> {
                    String name = electricProduct[random.nextInt(electricProduct.length)];
                    productSorter.sortProduct(new ElectricProduct(name,randomId));
                }
            }
        }
    }
}
