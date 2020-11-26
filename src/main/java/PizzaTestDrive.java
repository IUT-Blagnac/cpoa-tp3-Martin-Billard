public class PizzaTestDrive {
    public static void main(String[] args) {
        Pizzeria boutiqueBrest = FabriquePizzeria.getInstance().creerPizzeria("Brest");
        Pizzeria boutiqueStrasbourg = FabriquePizzeria.getInstance().creerPizzeria("Strasbourg");
        Pizza pizza = boutiqueBrest.commanderPizza("fromage");
        System.out.println("JMB a commandé une " + pizza.getNom() + "\n");
        pizza = boutiqueStrasbourg.commanderPizza("fromage");
        System.out.println("JMI a commandé une " + pizza.getNom() + "\n");
    }
}
