package product;

public class Juice extends Drinks {
    @Override
    public void prepare() {
        System.out.println("Juice is preparing");
    }

    @Override
    public void serve() {
        System.out.println("Juice is serving");
    }
}
