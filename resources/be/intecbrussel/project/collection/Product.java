package be.intecbrussel.project.collection;

import java.util.Objects;

public class Product {
    private String name;
    private int productId;

    public Product(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return  true;
        if (!(o instanceof Product product)) return false;
        return productId == product.productId && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productId);
    }
}
