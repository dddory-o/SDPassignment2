package factory;

import product.Drinks;
import product.Tea;

public class TeaFactory extends DrinksFactory {
    @Override
    public Drinks createDrinks() {
        return new Tea();
    }
}
