import java.util.Scanner;

import Model.Establishment;
import Model.Product;
import Traits.Functions;

public class App {
    public static void main(String[] args) throws Exception {
        short numberOfProducts;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o nome do estabelecimento?");
        String establishmentName = input.nextLine();

        System.out.println("Qual é o nome do proprietário?");
        String establishmentOwner = input.nextLine();

        Establishment establishment = new Establishment(establishmentName, establishmentOwner);

        System.out.println("Muito bem, " + establishment.ownerName + ". Vamos contar o estoque do estabelecimento " + establishment.name.toUpperCase());

        System.out.println("Quantos produtos tu desejas inserir?");
        numberOfProducts = input.nextShort();
        input.nextLine();

        for(short i = 0; i < numberOfProducts; i++){
            System.out.println("Qual é o nome do produto novo?");
            String productName = input.nextLine();

            System.out.println("Qual é o preço do produto novo?");
            String productPrice = input.nextLine();

            System.out.println("Qual é o quantidade do produto novo?");
            Byte productQuantity = input.nextByte();

            Product product = new Product(productName, productPrice, productQuantity);

            establishment.addProduct(product);

            System.out.println("O nome do produto é: " + product.name);
            System.out.println("O preço do produto é: " + product.price);
        }

        for(Product product : establishment.products){
            System.out.println("O preço do produto " + product.name + " é " + product.price + " reais.");
        }
    }
}
