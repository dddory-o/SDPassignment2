import abstractfactory.*;
import product.Drinks;

public class ApplicationRunner {

    public static void execute() {
        DrinksAbstractFactory hotFactory = FactoryProducer.getHotFactory();
        DrinksAbstractFactory coldFactory = FactoryProducer.getColdFactory();

        Drinks coffee = hotFactory.createCoffee();
        coffee.prepare();
        coffee.serve();

        Drinks tea = hotFactory.createTea();
        tea.prepare();
        tea.serve();

        Drinks juice = coldFactory.createJuice();
        juice.prepare();
        juice.serve();
    }
}
