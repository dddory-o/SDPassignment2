package product;

public class Tea extends Drinks {
    @Override
    public void prepare() {
        System.out.println("Tea is preparing");
    }

    @Override
    public void serve() {
        System.out.println("Tea is serving");
    }
}
