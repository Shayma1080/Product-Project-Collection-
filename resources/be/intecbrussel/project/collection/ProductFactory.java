package be.intecbrussel.project.collection;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
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

    public void createProducts(int amount) {
        ArrayList<FoodProduct> food = new ArrayList<>();
        for (int i = 0; i < random.nextInt(151); i++) {
            if (true) {
                foodProducts[i] += amount;
                int foodRandom = random.nextInt(foodProducts.length);
                String gekozenwoord1 = foodProducts[i];
                System.out.println(i + " " + gekozenwoord1 +" ");
            } else if (true) {
                healthProducts[i] += amount;
                int healthRandom = random.nextInt(healthProducts.length);
                String gekozenwoord2 = healthProducts[i];
                System.out.println(i + " " + gekozenwoord2 + " ");
            } else {
                electricProduct[i] += amount;
                int electriceRandom = random.nextInt(electricProduct.length);
                String gekozenwoord3 = electricProduct[i];
                System.out.println(i + " " + gekozenwoord3 +" ");
            }

        }
//        Queue<ProductSorter> products = new PriorityQueue<>();
//        products order = productSorter.peek();
//        while(productSorter!=null){
//            System.out.println();
//        }
    }
}
