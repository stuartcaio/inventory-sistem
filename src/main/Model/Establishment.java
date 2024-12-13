package main.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Establishment {
    public String name;
    public String ownerName;
    public ArrayList<Product> products;
    public double stockValue;

    public Establishment(String name, String ownerName){
        this.name = name;
        this.ownerName = ownerName;
        this.products = new ArrayList<>();
    }
}
