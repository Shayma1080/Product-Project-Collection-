package be.intecbrussel.project.collection;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {
    private List<Product> products= new ArrayList<>();
    private List<FoodProduct> foodProducts= new ArrayList<>();
    private List<HealthProduct> healthProducts= new ArrayList<>();
    private List<ElectricProduct> electricProducts= new ArrayList<>();


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

        if(!products.contains(product)){
            products.add(product);
            if(product instanceof FoodProduct food){
                foodProducts.add(food);
            } else if (product instanceof HealthProduct health) {
                healthProducts.add(health);
            }else if(product instanceof  ElectricProduct electricProduct){
                electricProducts.add(electricProduct);
            }
        }
        return product;
    }
}
