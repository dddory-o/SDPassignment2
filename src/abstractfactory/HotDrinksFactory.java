package abstractfactory;

import product.Coffee;
import product.Drinks;
import product.Tea;

public class HotDrinksFactory extends DrinksAbstractFactory {
    @Override
    public Drinks createCoffee() {
        return new Coffee();
    }

    @Override
    public Drinks createTea() {
        return new Tea();
    }

    @Override
    public Drinks createJuice() {
        // Hot factory usually doesn’t create cold drinks
        return null;
    }
}
