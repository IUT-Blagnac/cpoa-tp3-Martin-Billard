public class PizzeriaBrest extends Pizzeria{
    public PizzeriaBrest(SimpleFabriqueDePizzas f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        return fabrique.creerPizza(type);
    }
}
