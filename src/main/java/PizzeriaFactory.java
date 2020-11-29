public class PizzeriaFactory {

    private static PizzeriaFactory instance = null;

    private PizzeriaFactory() {
    }

    public synchronized static PizzeriaFactory getInstance() {
        if (instance == null) {
            instance = new PizzeriaFactory();
        }
        return instance;
    }
    public Pizzeria creerPizzeria(String name){
        Pizzeria pizzeria;
        switch (name) {
            case "Brest":
                pizzeria = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
                break;
            case "Strasbourg":
                pizzeria = new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
                break;
            default:
                pizzeria = null;
        }
        return pizzeria;
    }
}
