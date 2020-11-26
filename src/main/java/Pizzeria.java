/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {

    SimpleFabriqueDePizzas fabrique;
    public Pizzeria(SimpleFabriqueDePizzas f) {
        this.fabrique = f;
    }

    /**
     * @param type
     * @return a Pizza object according to the type
     */

    public final Pizza commanderPizza(String type) {
        Pizza pizza;

        pizza = creerPizza(type);
        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();

        return pizza;
    }
    protected abstract Pizza creerPizza(String type);
}