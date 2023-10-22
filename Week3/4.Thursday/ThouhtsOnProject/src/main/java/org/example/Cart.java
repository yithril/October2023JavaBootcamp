package org.example;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cartItems = new ArrayList<>();

    public Cart(){

    }

    //method to put items in the cart
    public void addToCart(Product product){
        this.cartItems.add(product);
    }

    //method to take items from the cart

    //method to sum up the total price of all things in the cart
}
