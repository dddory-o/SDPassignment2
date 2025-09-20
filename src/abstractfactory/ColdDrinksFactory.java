package abstractfactory;

import product.Drinks;
import product.Juice;

public class ColdDrinksFactory extends DrinksAbstractFactory {
    @Override
    public Drinks createCoffee() {
        return null; // холодная фабрика не делает coffee
    }

    @Override
    public Drinks createTea() {
        return null; // холодная фабрика не делает tea
    }

    @Override
    public Drinks createJuice() {
        return new Juice();
    }
}
