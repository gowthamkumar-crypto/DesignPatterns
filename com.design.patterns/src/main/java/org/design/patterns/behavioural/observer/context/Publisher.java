package org.design.patterns.behavioural.observer.context;

import org.design.patterns.behavioural.observer.observers.ISubscriber;
import org.design.patterns.behavioural.observer.products.IProduct;

import java.util.ArrayList;

public class Publisher implements IPublisher{
    ArrayList<ISubscriber> subscribers = new ArrayList<>();
    @Override
    public void addSubscriber(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(IProduct product) {
        subscribers.forEach(subscriber -> subscriber.update(product.getStock(), product.getProductName()));
    }
}
