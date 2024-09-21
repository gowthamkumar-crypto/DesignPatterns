package org.design.patterns.behavioural.strategy.context;

import org.design.patterns.behavioural.strategy.strategies.Strategy;

public class Navigator {
    Strategy strategy;
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.buildRoute();
    }
}
