package org.design.patterns.behavioural.observer;

import org.design.patterns.behavioural.observer.observers.AppAlertObserver;
import org.design.patterns.behavioural.observer.observers.EmailAlertObserver;
import org.design.patterns.behavioural.observer.observers.ISubscriber;
import org.design.patterns.behavioural.observer.observers.MsgAlertObserver;
import org.design.patterns.behavioural.observer.products.IProduct;
import org.design.patterns.behavioural.observer.products.MacBook;
import org.design.patterns.behavioural.observer.products.SamsungPhone;

public class Client {
    public static void main(String[] args){
        IProduct mac = new MacBook();
        IProduct phone = new SamsungPhone();

        mac.addStock(10);
        phone.addStock(20);


        mac.getPublisher().addSubscriber(new EmailAlertObserver());
        mac.getPublisher().addSubscriber(new AppAlertObserver());
        mac.getPublisher().addSubscriber(new MsgAlertObserver());
        mac.getPublisher().addSubscriber(new EmailAlertObserver());
        mac.getPublisher().notifySubscriber(mac);
        System.out.println("\n");
        phone.getPublisher().addSubscriber(new EmailAlertObserver());
        phone.getPublisher().addSubscriber(new AppAlertObserver());
        phone.getPublisher().addSubscriber(new MsgAlertObserver());
        ISubscriber o2 = new EmailAlertObserver();
        phone.getPublisher().addSubscriber(o2);
        System.out.println("after adding");
        phone.getPublisher().notifySubscriber(phone);
        phone.getPublisher().removeSubscriber(o2);
        System.out.println("after remove");
        phone.getPublisher().notifySubscriber(phone);

        System.out.println("\n");
        mac.getPublisher().addSubscriber(new AppAlertObserver());
        mac.getPublisher().notifySubscriber(mac);

    }
}
