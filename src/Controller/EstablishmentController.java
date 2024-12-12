package Controller;

import java.util.Scanner;

import Model.Establishment;
import Model.Product;
import Traits.Functions;

public class EstablishmentController {
    private Establishment establishment;

    public Establishment getEstablishment(){
        return this.establishment;
    }

    public void createEstablishment(){
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o nome do estabelecimento?");
        String establishmentName = input.nextLine();

        System.out.println("Qual é o nome do proprietário?");
        String establishmentOwner = input.nextLine();

        this.establishment = new Establishment(establishmentName, establishmentOwner);
    }

    public void addProduct(){
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o nome do produto novo?");
        String productName = input.nextLine();

        System.out.println("Qual é o preço do produto novo?");
        String productPrice = input.nextLine();

        System.out.println("Qual é o quantidade do produto novo?");
        Byte productQuantity = input.nextByte();

        Product product = new Product(productName, productPrice, productQuantity);

        this.establishment.products.add(product);
        this.establishment.stockValue += (Functions.convertDoubleToAmericanFormat(productPrice) * productQuantity);

        input.nextLine();
    }
}
