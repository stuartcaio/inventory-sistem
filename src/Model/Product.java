package Model;

import Traits.Functions;

public class Product {
    public String name;
    public double price;
    public byte initialQuantity;

    public Product(String name, String price, byte initialQuantity){
        this.name = name;
        this.price = Functions.convertDoubleToAmericanFormat(price);
        this.initialQuantity = initialQuantity;
    }

    public String getPriceInBrazilianFormat(){
        return Double.toString(this.price).replace(".", ",");
    }
}
