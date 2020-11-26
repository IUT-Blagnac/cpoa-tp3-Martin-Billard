/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaFromageStyleBrest extends Pizza {

    public PizzaFromageStyleBrest() {
        super();
        this.nom="Pizza sauce style brest et fromage";
        this.garniture.add("Parmigiano reggiano râpé");

    }
    @Override
    public void preparer() {
        System.out.println("Préparation de"+this.getNom());
        System.out.println("Étalage de la pâte...");
        System.out.println("Ajout de la sauce...");
        System.out.println("Ajout des garnitures:");
        System.out.println(" "+this.garniture.get(0));

    }

    @Override
    public void cuire() {
        System.out.println("Cuisson 25 minutes à 180°");
    }

    @Override
    public void couper() {
        System.out.println("Découpage en parts carrées");
    }

    @Override
    public void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    @Override
    public String getNom() {
        return super.getNom();
    }
}
