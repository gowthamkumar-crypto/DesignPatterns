package org.design.patterns.behavioural.observer.observers;

public class MsgAlertObserver implements ISubscriber {
    @Override
    public void update(int stock,String productName) {
        System.out.println("update -> MsgAlertObserver -> productName: "+productName +" stock:"+stock);
    }
}
