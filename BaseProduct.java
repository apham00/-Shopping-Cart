package cis434hw1;

public class BaseProduct implements Product {
public static double basePrice = 5.00; 

    @Override
    public double getSalePrice() {
        return basePrice;
    }
    
}
