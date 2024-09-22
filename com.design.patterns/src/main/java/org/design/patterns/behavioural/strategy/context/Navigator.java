package org.design.patterns.behavioural.strategy.context;

import org.design.patterns.behavioural.strategy.strategies.IStrategy;

public class Navigator implements INavigator {
    IStrategy iStrategy;
    public void setStrategy(IStrategy IStrategy){
        this.iStrategy = IStrategy;
    }

    public void executeStrategy(){
        iStrategy.buildRoute();
    }
}
