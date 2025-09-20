package abstractfactory;

public class FactoryProducer {

    public static DrinksAbstractFactory getHotFactory() {
        return new HotDrinksFactory();
    }

    public static DrinksAbstractFactory getColdFactory() {
        return new ColdDrinksFactory();
    }
}
