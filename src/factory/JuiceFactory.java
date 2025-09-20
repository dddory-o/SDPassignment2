package factory;

import product.Drinks;
import product.Juice;

public class JuiceFactory extends DrinksFactory {
    @Override
    public Drinks createDrinks() {
        return new Juice();
    }
}
