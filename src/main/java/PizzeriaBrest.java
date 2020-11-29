public class PizzeriaBrest extends Pizzeria{
    public PizzeriaBrest(PizzaFactory f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        return fabrique.creerPizza(type);
    }
}
