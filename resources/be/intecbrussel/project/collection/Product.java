package be.intecbrussel.project.collection;

import java.util.Objects;

public class Product {
    private String name;
    private int productId;

    public Product(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                '}';
    }
// 2 object logisch kunne vergelijken
    @Override
    public boolean equals(Object o) {
        if(this == o) return  true;
        if (!(o instanceof Product product)) return false;
        return productId == product.productId && Objects.equals(name, product.name);
    }
//Sneller opzoek en correct opslag van unique objecten
    @Override
    public int hashCode() {
        return Objects.hash(name, productId);
    }
}
