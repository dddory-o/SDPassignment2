package product;

public class Coffee extends Drinks {
    @Override
    public void prepare() {
        System.out.println("Coffee is preparing");
    }

    @Override
    public void serve() {
        System.out.println("Coffee is serving");
    }
}
