package org.design.patterns.behavioural.observer.products;

import org.design.patterns.behavioural.observer.context.IPublisher;
import org.design.patterns.behavioural.observer.context.Publisher;

public class SamsungPhone implements IProduct{
    public int stock;
    public static final String productName = "SamsungPhone";
    IPublisher publisher = new Publisher();

    public void addStock(int stock){
        this.stock = this.stock+stock;
        publisher.notifySubscriber(this);
    }
    @Override
    public int getStock() {
        return stock;
    }
    @Override
    public String getProductName() {
        return productName;
    }
    @Override
    public IPublisher getPublisher() {
        return publisher;
    }
}
