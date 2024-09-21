package org.design.patterns.behavioural.strategy.strategies.impl;

import org.design.patterns.behavioural.strategy.strategies.Strategy;

public class WalkStrategy implements Strategy {
    public void buildRoute() {
        System.out.println("Building new new route for walkers");
    }
}
