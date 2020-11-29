import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {

	protected   String nom;
	protected  String pate;
	protected  String sauce;
	protected ArrayList<String> garniture;

	public Pizza() {
		this.garniture = new ArrayList<String>();
	}

	public void preparer() {
		// TODO Auto-generated method stub
		
	}

	public void cuire() {
		// TODO Auto-generated method stub
		
	}

	public void couper() {
		// TODO Auto-generated method stub
		
	}

	public void emballer() {
		// TODO Auto-generated method stub
		
	}
	public String getNom(){
		return this.nom;
	}

}
