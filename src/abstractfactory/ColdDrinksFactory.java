package abstractfactory;

import product.Drinks;
import product.Juice;

public class ColdDrinksFactory extends DrinksAbstractFactory {
    @Override
    public Drinks createCoffee() {
        return null;
    }

    @Override
    public Drinks createTea() {
        return null;
    }

    @Override
    public Drinks createJuice() {
        return new Juice();
    }
}
