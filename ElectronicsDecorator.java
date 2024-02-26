package cis434hw1;

    public class ElectronicsDecorator extends ProductDecorator {
        private final double basePrice = 5; 
        private final double salePrice; 
    
    public ElectronicsDecorator(Product decoratedProduct) {    
        super(decoratedProduct);
        this.salePrice = basePrice * 2.25;
    }

    @Override
    public double getSalePrice() { 
        return salePrice; 
    }
}

