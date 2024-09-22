package org.design.patterns.behavioural.observer.observers;

public class AppAlertObserver implements ISubscriber {
    @Override
    public void update(int stock,String productName) {
        System.out.println("update -> AppAlertObserver -> productName: "+productName +" stock:"+stock);
    }
}
