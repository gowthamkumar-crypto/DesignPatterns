package org.design.patterns.behavioural.strategy.strategies.impl;

import org.design.patterns.behavioural.strategy.strategies.Strategy;

public class BusStrategy implements Strategy {
    public void buildRoute() {
        System.out.println("Building bus connectivty stategy");
    }
}
