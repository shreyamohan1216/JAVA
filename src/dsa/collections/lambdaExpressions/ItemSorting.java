package dsa.collections.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

class Product{
    String name;
    int price;
    int quantity;

    public Product(int price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }
}
public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(20000, "Mobile", 6));
        products.add(new Product(45000, "Camera", 3));
        products.add(new Product(70000, "Laptop", 1));
        for (Product p : products) {
            System.out.println(p.price + "," + p.name + "," + p.quantity);
        }
        Collections.sort(products, (p1, p2) -> p2.quantity - p1.quantity);
        for (Product p:products){
            System.out.println(p.name + "," + p.price + "," + p.quantity);

        }
    }
}