import abstractfactory.DrinksAbstractFactory;
import abstractfactory.FactoryProducer;
import product.Drinks;

public class Main {
    public static void main(String[] args) {
        DrinksAbstractFactory hotFactory = FactoryProducer.getHotFactory();

        Drinks coffee = hotFactory.createCoffee();
        coffee.prepare();
        coffee.serve();

        Drinks tea = hotFactory.createTea();
        tea.prepare();
        tea.serve();

        DrinksAbstractFactory coldFactory = FactoryProducer.getColdFactory();

        Drinks juice = coldFactory.createJuice();
        juice.prepare();
        juice.serve();
    }
}
