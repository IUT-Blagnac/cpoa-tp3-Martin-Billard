public abstract class SimpleFabriqueDePizzas {

    public Pizza creerPizza(String type) {
        Pizza pizza;
        switch (type){
            case "fromage":
                pizza = new PizzaFromageStyleBrest() ;
            case "grecque":
                pizza = new PizzaGrecque() ;
            default:
                pizza = new PizzaPoivrons() ;
        }

        return pizza ;
    }
}
