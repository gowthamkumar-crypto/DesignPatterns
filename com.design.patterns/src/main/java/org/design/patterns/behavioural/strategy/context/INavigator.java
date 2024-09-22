package org.design.patterns.behavioural.strategy.context;

import org.design.patterns.behavioural.strategy.strategies.IStrategy;

public interface INavigator {
    void setStrategy(IStrategy iStrategy);
    void executeStrategy();
}
