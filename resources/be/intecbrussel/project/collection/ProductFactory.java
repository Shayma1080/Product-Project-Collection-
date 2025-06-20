package be.intecbrussel.project.collection;

public class ProductFactory {
    private ProductSorter productSorter;
    private String[] foodProducts;
    private String[] healthProducts;
    private  String[] electricProduct;

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    public int createProducts(int amount){

        return amount;
    }
}
