package cis434hw1;

    public class FoodDecorator extends ProductDecorator {
        private final double basePrice = 5; 
        private final double salePrice; 
    
    public FoodDecorator(Product decoratedProduct) {    
        super(decoratedProduct);
        this.salePrice = basePrice * 0.75;
    }

    @Override
    public double getSalePrice() { 
        return salePrice; 
    }
}

