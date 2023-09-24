package src.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Product product1= new Product();
        Product product2 = new InHouseProduct();

        List<Product> array = new ArrayList<>();
        array.add(product2);
        array.add(product1);

        for (Product product : array){
            System.out.println(product.getDiscount());
        }
    }
}
