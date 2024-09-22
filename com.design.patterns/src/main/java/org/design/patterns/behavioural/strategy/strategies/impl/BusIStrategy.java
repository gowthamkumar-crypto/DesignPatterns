package org.design.patterns.behavioural.strategy.strategies.impl;

import org.design.patterns.behavioural.strategy.strategies.IStrategy;

public class BusIStrategy implements IStrategy {
    public void buildRoute() {
        System.out.println("Building bus connectivty stategy");
    }
}
