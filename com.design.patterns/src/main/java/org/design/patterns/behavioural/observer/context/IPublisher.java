package org.design.patterns.behavioural.observer.context;

import org.design.patterns.behavioural.observer.observers.ISubscriber;
import org.design.patterns.behavioural.observer.products.IProduct;

public interface IPublisher {
    void addSubscriber(ISubscriber subscriber);
    void removeSubscriber(ISubscriber subscriber);
    void notifySubscriber(IProduct product);
}
