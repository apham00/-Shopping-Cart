package cis434hw1;

    public class DesertDecorator extends ProductDecorator {
        private final double basePrice = 5; 
        private final double salePrice; 
    
    public DesertDecorator(Product decoratedProduct) {    
        super(decoratedProduct);
        this.salePrice = basePrice * 1.25;
    }

    @Override
    public double getSalePrice() { 
        return salePrice; 
    }
}

