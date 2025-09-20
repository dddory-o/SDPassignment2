package factory;

import product.Coffee;
import product.Drinks;

public class CoffeeFactory extends DrinksFactory {
    @Override
    public Drinks createDrinks() {
        return new Coffee();
    }
}
