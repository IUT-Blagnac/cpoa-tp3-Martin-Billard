public class FabriquePizzeria {

    private static FabriquePizzeria instance = null;

    private FabriquePizzeria() {
    }

    public synchronized static FabriquePizzeria getInstance() {
        if (instance == null) {
            instance = new FabriquePizzeria();
        }
        return instance;
    }
    public Pizzeria creerPizzeria(String name){
        Pizzeria pizzeria;
        switch (name) {
            case "Brest":
                pizzeria = new PizzeriaBrest(SimpleFabriqueDePizzasBrest.getInstance());
                break;
            case "Strasbourg":
                pizzeria = new PizzeriaStrasbourg(SimpleFabriqueDePizzasStrasbourg.getInstance());
                break;
            default:
                pizzeria = null;
        }
        return pizzeria;
    }
}
