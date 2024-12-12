package Traits;

public class Functions {
    public static double convertDoubleToAmericanFormat(String price){
        return Double.parseDouble(price.replace(",", "."));
    }

    public static String getDoubleInBrazilianFormat(double price){
        return Double.toString(price).replace(".", ",");
    }
}
