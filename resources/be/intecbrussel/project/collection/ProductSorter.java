package be.intecbrussel.project.collection;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {
    private List<Product> products;
    private List<FoodProduct> foodProducts;
    private List<HealthProduct> healthProducts;
    private List<ElectricProduct> electricProducts;

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    public Product sortProduct(Product product){

        products.add((Product) foodProducts);
        products.add((Product)healthProducts);
        products.add((Product)electricProducts);
        products.add(product);
        products.stream().distinct();


        return product;
    }
}
