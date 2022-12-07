package annotations.N1E2;

/*
La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per 
paràmetre el nombre d'hores treballades i el multiplica pel preu/hora.

En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores 
treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel 
preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe 
TreballadorOnline.
*/
public class TreballadorOnline extends Treballador{
	private final double tarifaPlana;
	
	public TreballadorOnline(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);
		tarifaPlana = 70;
	}
	
	// Indiquem al compilador que ens avisi amb un error sino sobrescribim un mètode de la classe pare:
	@Override
	public void calcularSou(double horesTreballades) {

		System.out.println("Sou treballador online: " + (super.preuHora * horesTreballades + tarifaPlana));
		
	}
	
	public String getNom() {
		return nom;
	}
	
	@Deprecated
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}
	
	@Deprecated
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	
	@Deprecated
	public double getPreuHora() {
		return preuHora;
	}

	public void setPreuHora(double preuHora) {
		this.preuHora = preuHora;
	}
	
}
