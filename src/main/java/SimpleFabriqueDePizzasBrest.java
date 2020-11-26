public class SimpleFabriqueDePizzasBrest extends SimpleFabriqueDePizzas {

    private static SimpleFabriqueDePizzasBrest instance = null;

    private SimpleFabriqueDePizzasBrest() {

    }

    public synchronized static SimpleFabriqueDePizzasBrest getInstance() {
        if (instance == null) {
            instance = new SimpleFabriqueDePizzasBrest();
        }
        return instance;
    }
    public Pizza creerPizza(String type) {

        Pizza pizza;
        switch (type) {
            case "fromage":
                pizza = new PizzaFromageStyleBrest();
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
