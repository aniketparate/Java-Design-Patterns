package stategyDesignPattern1;

import stategyDesignPattern1.controller.CreditCardAlgorithm;
import stategyDesignPattern1.controller.PaypalAlgorithm;
import stategyDesignPattern1.controller.ShoppingCart;
import stategyDesignPattern1.model.Product;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 1500);
        Product shirt = new Product("974", 1000);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //payment Decisions
        cart.pay(new PaypalAlgorithm("abc@gmail.com", "abc"));

        cart.pay(new CreditCardAlgorithm("ABC", "54464343"));
    }
}
