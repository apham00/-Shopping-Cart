package cis434hw1;

public abstract class ProductDecorator implements Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }

    @Override
    public double getSalePrice() {
        return decoratedProduct.getSalePrice();
    }
}