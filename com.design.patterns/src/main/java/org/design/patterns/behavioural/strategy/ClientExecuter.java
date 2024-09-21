package org.design.patterns.behavioural.strategy;

import org.design.patterns.behavioural.strategy.context.Navigator;
import org.design.patterns.behavioural.strategy.strategies.impl.BusStrategy;
import org.design.patterns.behavioural.strategy.strategies.impl.FamousPlacesStrategy;
import org.design.patterns.behavioural.strategy.strategies.impl.WalkStrategy;

public class ClientExecuter {
    public static void main(String[] args){
        Navigator n = new Navigator();

        n.setStrategy(new BusStrategy());
        n.executeStrategy();

        n.setStrategy(new WalkStrategy());
        n.executeStrategy();

        n.setStrategy(new FamousPlacesStrategy());
        n.executeStrategy();
    }
}
