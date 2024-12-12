import java.util.Scanner;

import Controller.EstablishmentController;
import Model.Establishment;
import Model.Product;
import Traits.Functions;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        EstablishmentController establishmentController = new EstablishmentController();
        short numberOfProducts;

        establishmentController.createEstablishment();

        Establishment currentEstablishment = establishmentController.getEstablishment();

        System.out.println("Muito bem, " + currentEstablishment.ownerName + ". Vamos contar o estoque do estabelecimento " + currentEstablishment.name.toUpperCase());

        System.out.println("Quantos produtos tu desejas inserir?");
        numberOfProducts = input.nextShort();
        input.nextLine();

        for(short i = 0; i < numberOfProducts; i++){
            establishmentController.addProduct();
        }

        for(Product product : currentEstablishment.products){
            System.out.println("O preço do produto " + product.name + " é " + Functions.getDoubleInBrazilianFormat(product.price) + " reais.");
        }
    }
}
