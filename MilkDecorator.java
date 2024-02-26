package cis434hw1;

    public class MilkDecorator extends ProductDecorator {
        private final double basePrice = 5; 
        private final double salePrice; 
    
    public MilkDecorator(Product decoratedProduct) {    
        super(decoratedProduct);
        this.salePrice = basePrice * 1.15;
    }

    @Override
    public double getSalePrice() { 
        return salePrice; 
    }
}

