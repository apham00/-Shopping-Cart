package cis434hw1;
import java.util.Scanner;
import java.util.ArrayList;

public class CIS434HW1 {

    public static void printPrice (ArrayList<Product> products) {
        double totalPrice = 0;
        Singleton.getInstance().print("*****Shopping Cart***** \n");
        for (Product product : products) { //print product array and calculate totalPrice
             if (product.getSalePrice() == 3.75) {
                 Singleton.getInstance().print("Food: " + product.getSalePrice() + " \n");
             } else if (product.getSalePrice() == 6.25) {
                 Singleton.getInstance().print("Food/Desert/Milk: " + product.getSalePrice() + " \n");
             } else if (product.getSalePrice() == 11.25) {
                 Singleton.getInstance().print("Electronics: " + product.getSalePrice() + " \n");
             }
            totalPrice += product.getSalePrice();
        }
        String totalPriceString = String.format("%.2f", totalPrice); // convert double to string
        Singleton.getInstance().print("Total: " + totalPriceString + "\n"); // print total price
    }
    
    public static void printMenu() { // menu
        Singleton.getInstance().print("""
                                      Andrew's Storefront: 
                                      1) Author Info 
                                      2) Add Bread 
                                      3) Add Ice Cream 
                                      4) Add Lettuce 
                                      5) Cupcake 
                                      6) Cake 
                                      7) Add Phone 
                                      8) Add Watch 
                                      9) Print prices 
                                      0) Exit 
                                      """);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> product = new ArrayList<>();
        Singleton singleton = Singleton.getInstance();
        int input = 1;
        printMenu();
        while (input != 0) {
        input = scanner.nextInt();
        switch (input) {
            case 1: // author info
                singleton.print("""
                                Name: Andrew Pham 
                                CSU ID: 2765261 
                                CIS 434: Design Patterns 
                                """);
                break;
            case 2: // bread - food
                product.add(new FoodDecorator(new BaseProduct()));
                singleton.print("Bread added. \n"); 
                break;
            case 3: // ice cream - food, desert, milk
                product.add(new DesertDecorator(new FoodDecorator(new BaseProduct())));
                singleton.print("Ice Cream added. \n");
                break;
            case 4: // lettuce - food
                product.add(new FoodDecorator(new BaseProduct()));
                singleton.print("Lettuce added. \n");
                break;
            case 5: // cupcake - food, desert
                product.add(new DesertDecorator (new FoodDecorator(new BaseProduct())));
                singleton.print("Cupcake added. \n");
                break;
            case 6: // cake - food, desert
                product.add(new DesertDecorator (new FoodDecorator(new BaseProduct())));
                singleton.print("Cake added. \n");
                break;
            case 7: // phone - electronics
                product.add(new ElectronicsDecorator(new BaseProduct()));
                singleton.print("Phone added. \n");
                break;
            case 8: // watch - electronics
                product.add(new ElectronicsDecorator(new BaseProduct()));
                singleton.print("Watch added. \n");
                break;
            case 9: // print prices
                printPrice(product);
                break;
            case 0: // exit
                singleton.print("Exiting store... ");
                break;
            default: 
                singleton.print("Invalid option. Please try again. \n");
                break;
                
        }
        }
    }
    
    
}
