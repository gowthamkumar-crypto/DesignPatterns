package org.design.patterns.behavioural.observer.products;

import org.design.patterns.behavioural.observer.context.IPublisher;
import org.design.patterns.behavioural.observer.context.Publisher;

public interface IProduct {
    void addStock(int stock);
    int getStock();
    String getProductName();
    IPublisher getPublisher();
}
