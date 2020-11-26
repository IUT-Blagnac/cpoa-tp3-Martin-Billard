public class SimpleFabriqueDePizzasStrasbourg extends SimpleFabriqueDePizzas {

    private static SimpleFabriqueDePizzasStrasbourg instance = null;

    private SimpleFabriqueDePizzasStrasbourg() {

    }

    public synchronized static SimpleFabriqueDePizzasStrasbourg getInstance() {
        if (instance == null) {
            instance = new SimpleFabriqueDePizzasStrasbourg();
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
