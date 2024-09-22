package org.design.patterns.behavioural.strategy;

import org.design.patterns.behavioural.strategy.context.INavigator;
import org.design.patterns.behavioural.strategy.context.Navigator;
import org.design.patterns.behavioural.strategy.strategies.impl.BusIStrategy;
import org.design.patterns.behavioural.strategy.strategies.impl.FamousPlacesIStrategy;
import org.design.patterns.behavioural.strategy.strategies.impl.WalkIStrategy;

public class ClientExecuter {
    public static void main(String[] args){
        INavigator n = new Navigator();
        n.setStrategy(new BusIStrategy());
        n.executeStrategy();

        n.setStrategy(new WalkIStrategy());
        n.executeStrategy();

        n.setStrategy(new FamousPlacesIStrategy());
        n.executeStrategy();
    }
}
