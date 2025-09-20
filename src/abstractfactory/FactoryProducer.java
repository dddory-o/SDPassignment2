package abstractfactory;

public class FactoryProducer {
    public static DrinksAbstractFactory getFactory(String choice) {
        if ("HOT".equalsIgnoreCase(choice)) {
            return new HotDrinksFactory();
        } else if ("COLD".equalsIgnoreCase(choice)) {
            return new ColdDrinksFactory();
        }
        return null;
    }
}
