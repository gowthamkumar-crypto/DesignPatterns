package org.design.patterns.behavioural.strategy.strategies.impl;

import org.design.patterns.behavioural.strategy.strategies.IStrategy;

public class FamousPlacesIStrategy implements IStrategy {
    public void buildRoute() {
        System.out.println("Building strategy to connect famous places");
    }
}
