import abstractfactory.DrinksAbstractFactory;
import abstractfactory.FactoryProducer;
import product.Drinks;

public class Main {
    public static void main(String[] args) {
        DrinksAbstractFactory hotFactory = FactoryProducer.getFactory("HOT");

        Drinks coffee = hotFactory.createCoffee();
        coffee.prepare();
        coffee.serve();

        Drinks tea = hotFactory.createTea();
        tea.prepare();
        tea.serve();

        // Получаем фабрику холодных напитков
        DrinksAbstractFactory coldFactory = FactoryProducer.getFactory("COLD");

        Drinks juice = coldFactory.createJuice();
        juice.prepare();
        juice.serve();
    }
}
