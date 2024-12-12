package Model;

import java.util.ArrayList;

public class Establishment {
    public String name;
    public String ownerName;
    public ArrayList<Product> products;

    public Establishment(String name, String ownerName){
        this.name = name;
        this.ownerName = ownerName;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }
}
