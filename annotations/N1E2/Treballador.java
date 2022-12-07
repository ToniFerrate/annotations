package annotations.N1E2;

/*
La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per 
paràmetre el nombre d'hores treballades i el multiplica pel preu/hora.
*/
public class Treballador {
	protected String nom;
	protected String cognom;
	protected double preuHora;
	
	public Treballador(String nom, String cognom, double preuHora) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}
	
	public void calcularSou(double horesTreballades) {
		
		System.out.println("Sou: " + (preuHora * horesTreballades));
		
	}
	
}
