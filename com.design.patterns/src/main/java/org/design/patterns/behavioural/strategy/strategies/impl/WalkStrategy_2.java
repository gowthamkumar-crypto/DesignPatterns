package org.design.patterns.behavioural.strategy.strategies.impl;

import org.design.patterns.behavioural.strategy.strategies.Strategy;

public class WalkStrategy_2 implements Strategy {
    public void buildRoute() {
        System.out.println("Building new new route for walkers");
    }
}
