package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraEverythingDecorator extends AbstractPizzaOrderDecorator{

    public ExtraEverythingDecorator (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(33));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra Everything";
    }
}

