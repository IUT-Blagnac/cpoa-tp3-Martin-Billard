public class PizzeriaStrasbourg extends Pizzeria {
    public PizzeriaStrasbourg(PizzaFactory f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        return fabrique.creerPizza(type);
    }
}
