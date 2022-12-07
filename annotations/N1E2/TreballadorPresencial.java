package annotations.N1E2;

/*
La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per 
paràmetre el nombre d'hores treballades i el multiplica pel preu/hora.

En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre 
d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades 
pel preu/hora, més el valor d'un atribut static anomenat benzina que afegirem en aquee.
sta class
*/
public class TreballadorPresencial extends Treballador{
	private static final double benzina = 100;
	
	public TreballadorPresencial(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);
	}
	
	// Indiquem al compilador que ens avisi amb un error sino sobrescribim un mètode de la classe pare:
	@Override
	public void calcularSou(double horesTreballades) {
		
		System.out.println("Sou treballador presencial: " + (super.preuHora * horesTreballades + benzina));
		
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
