package be.intecbrussel.project.collection;

import java.util.ArrayList;
import java.util.Random;

public class ProductFactory {
    Random random = new Random();
    private ProductSorter productSorter;
    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private  String[] electricProduct  = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    public int createProducts(int amount){
        ArrayList<FoodProduct> food = new ArrayList<>();
        for(int i= 0 ;i < amount;i++){

        }

        return amount;
    }
}
