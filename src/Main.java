import abstractfactory.DrinksAbstractFactory;
import abstractfactory.HotDrinksFactory;
import abstractfactory.ColdDrinksFactory;
import product.Drinks;

public class Main {
    public static void main(String[] args) {
        // Используем фабрику горячих напитков
        DrinksAbstractFactory hotFactory = new HotDrinksFactory();

        Drinks coffee = hotFactory.createCoffee();
        coffee.prepare();
        coffee.serve();

        Drinks tea = hotFactory.createTea();
        tea.prepare();
        tea.serve();

        // Используем фабрику холодных напитков
        DrinksAbstractFactory coldFactory = new ColdDrinksFactory();

        Drinks juice = coldFactory.createJuice();
        juice.prepare();
        juice.serve();
    }
}
