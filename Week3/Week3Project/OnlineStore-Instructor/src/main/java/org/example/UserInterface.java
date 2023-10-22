package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private ShoppingCart shoppingCart = new ShoppingCart();
    public void homeScreen(){

        boolean isShopping = true;
        Scanner scanner = new Scanner(System.in);

        while(isShopping){
            displayHomeScreenOptions();

            try{
                int userInput = scanner.nextInt();

                switch(userInput){
                    case 1:
                        displayProductSelectScreen();
                        break;
                    case 2:
                        displayCartScreen();
                        break;
                    case 3:
                        System.out.println("See you next time!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("That's not an option, sorry.");
                }
            }
            catch(Exception ex){
                System.out.println("That is not an option, sorry");
                scanner.nextLine();
            }
        }

    }

    private void displayCartScreen(){
        boolean isDisplayingCartScreen = true;

        Scanner scanner = new Scanner(System.in);

        while(isDisplayingCartScreen){
            displayCart(this.shoppingCart);
            System.out.println("Select from the following options:");
            System.out.println("1. Remove item from cart");
            System.out.println("2. Check Out");
            System.out.println("3. Go back");

            try{
                int userInput = scanner.nextInt();

                switch(userInput){
                    case 1:
                        System.out.println("Please type the SKU of the product you'd like to remove.");
                        scanner.nextLine();
                        removeFromCart(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Thank you for shopping at Hop Mart!");
                        this.shoppingCart.clearShoppingCart();
                        isDisplayingCartScreen = false;
                        break;
                    case 3:
                        isDisplayingCartScreen = false;
                        break;
                    default:
                        System.out.println("That's not an option try again please.");
                        break;
                }
            }
            catch(Exception ex){
                System.out.println("That's not an option!");
                scanner.nextLine();
            }
        }
    }

    private void displayProductSelectScreen(){
        boolean isOnProductScreen = true;

        Scanner scanner = new Scanner(System.in);

        while(isOnProductScreen){
            displayProducts();
            System.out.println("Select from the following options:");
            System.out.println("1. Search for product by name");
            System.out.println("2. Add to product to cart");
            System.out.println("3. Go back");

            try{
                int userInput = scanner.nextInt();
                ProductManager pm = new ProductManager();

                switch(userInput){
                    case 1:
                        System.out.println("Type in the name of the product you are searching for");
                        scanner.nextLine();
                        String productName = scanner.nextLine();

                        ArrayList<Product> productSearch = pm.SearchForProductsByName(productName);

                        System.out.printf("Here are the products we found matching your search term: %s %n", productName);

                        if(productSearch.size() == 0){
                            System.out.println("No products found matching your search term");
                        }
                        else{
                            for(Product p : productSearch){
                                System.out.printf("SKU: %s Product Name: %s Price: $%.2f Department: %s %n", p.getSku(), p.getProductName(), p.getPrice(), p.getDepartment());
                            }
                        }
                        break;
                    case 2:
                        //Get all products
                        ArrayList<Product> products = pm.LoadProductsFromFile();

                        //Ask the user to pick a product by its number - 1, to match the index of the product in the list
                        System.out.println("Input the number of the product that you want to add to your shopping cart:");

                        try{
                            int productToAddToCart = scanner.nextInt();

                            //if the number is not in the list, then tell them sorry, and kick them back up
                            if(productToAddToCart < 1 || productToAddToCart > products.size()){
                                System.out.println("Sorry, that is not a product you can select.");
                            }
                            else{
                                this.shoppingCart.addProductToCart(products.get(productToAddToCart - 1));
                                System.out.printf("You have added %s to your cart! %n", products.get(productToAddToCart - 1).getProductName());
                            }
                            //otherwise add it to the cart
                        }
                        catch(Exception ex){
                            System.out.println("That is not a valid product to choose.");
                        }

                        break;
                    case 3:
                        isOnProductScreen = false;
                        break;
                    default:
                        System.out.println("Sorry that's not an option. Try again please");
                        break;
                }
            }
            catch (Exception ex){
                System.out.println("That's not an option.");
                scanner.nextLine();
            }
        }
    }

    private void displayHomeScreenOptions(){
        System.out.println("Welcome to Hop Mart loyal and faithful customer!");
        System.out.println("Select from the following options:");
        System.out.println("1. View all products");
        System.out.println("2. View current shopping cart items");
        System.out.println("3. Exit program");
    }

    private void displayProducts(){
        System.out.println("*************Product List***************");

        ProductManager productManager = new ProductManager();

        ArrayList<Product> productsToDisplay = productManager.LoadProductsFromFile();

        for(int i = 0; i < productsToDisplay.size(); i++){
            Product p = productsToDisplay.get(i);
            System.out.printf("%d. SKU: %s Product Name: %s Price: $%.2f Department: %s %n", i + 1, p.getSku(), p.getProductName(), p.getPrice(), p.getDepartment());
        }
    }

    private void displayCart(ShoppingCart cart){
        if(cart.getProductsInCart().size() == 0){
            System.out.println("No products in cart!");
        }
        else{
            for(int i = 0; i < cart.getProductsInCart().size(); i++){
                Product p = cart.getProductsInCart().get(i);
                System.out.printf("%d. SKU: %s Product Name: %s Price: $%.2f Department: %s %n", i + 1, p.getSku(), p.getProductName(), p.getPrice(), p.getDepartment());
            }
        }
    }

    private void removeFromCart(String sku){
        Product productToRemove = null;

        for(Product p : this.shoppingCart.getProductsInCart()){
            if(p.getSku().equalsIgnoreCase(sku)){
                productToRemove = p;
                break;
            }
        }

        if(productToRemove == null){
            System.out.println("There is no product in your cart with that SKU");
        }
        else{
            this.shoppingCart.removeProductFromCart(productToRemove);
        }
    }
}
