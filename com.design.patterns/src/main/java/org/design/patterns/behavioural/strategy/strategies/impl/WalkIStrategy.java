package org.design.patterns.behavioural.strategy.strategies.impl;

import org.design.patterns.behavioural.strategy.strategies.IStrategy;

public class WalkIStrategy implements IStrategy {
    public void buildRoute() {
        System.out.println("Building new new route for walkers");
    }
}
