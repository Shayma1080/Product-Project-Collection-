package be.intecbrussel.project.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductSorter {
    private List<Product> products= new ArrayList<>();
    private List<FoodProduct> foodProducts= new ArrayList<>();
    private List<HealthProduct> healthProducts= new ArrayList<>();
    private List<ElectricProduct> electricProducts= new ArrayList<>();
    private final Set<Integer> usedIds = new HashSet<>();


    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    public Boolean sortProduct(Product product){
        if(!usedIds.add(product.getProductId())){
            return false;
        }
        products.add(product);

        switch (product){
            case FoodProduct f -> foodProducts.add(f);
            case HealthProduct h -> healthProducts.add(h);
            case ElectricProduct e -> electricProducts.add(e);
            default -> {}
        }
        return true;

    }
}
