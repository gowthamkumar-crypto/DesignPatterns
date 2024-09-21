package org.design.patterns.behavioural.strategy.strategies.impl;

import org.design.patterns.behavioural.strategy.strategies.Strategy;

public class FamousPlacesStrategy implements Strategy {
    public void buildRoute() {
        System.out.println("Building strategy to connect famous places");
    }
}
