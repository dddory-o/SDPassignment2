package abstractfactory;

import product.Drinks;

public abstract class DrinksAbstractFactory {
    public abstract Drinks createCoffee();
    public abstract Drinks createTea();
    public abstract Drinks createJuice();
}
