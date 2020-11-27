public class PizzaFactoryStrasbourg extends PizzaFactory {

    private static PizzaFactoryStrasbourg instance = null;

    private PizzaFactoryStrasbourg() {

    }

    public synchronized static PizzaFactoryStrasbourg getInstance() {
        if (instance == null) {
            instance = new PizzaFactoryStrasbourg();
        }
        return instance;
    }

    public Pizza creerPizza(String type) {

        Pizza pizza;
        switch (type) {
            case "fromage":
                pizza = new PizzaFromageStyleStrasboug();
                break;
            case "grecque":
                pizza = new PizzaGrecque();
                break;
            default:
                pizza = new PizzaPoivrons();
                break;
        }

        return pizza;
    }
}
