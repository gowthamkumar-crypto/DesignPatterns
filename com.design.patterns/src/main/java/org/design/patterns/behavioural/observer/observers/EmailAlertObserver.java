package org.design.patterns.behavioural.observer.observers;

public class EmailAlertObserver implements ISubscriber {
    @Override
    public void update(int stock,String productName) {
        System.out.println("update -> EmailAlertObserver -> productName: "+productName +" stock:"+stock);
    }
}
