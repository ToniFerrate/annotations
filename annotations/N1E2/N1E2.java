package annotations.N1E2;

/*
Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. 
Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent 
els
*/
public class N1E2 {

//	@SuppressWarnings("deprecation") // Suprimeix els warnings de Deprecated al mètode main.
	public static void main(String[] args) {
		
		// Sinó existís el mètode de nom calcularSou d'un paràmetre en la classe pare, el compilador ens 
		// hagués donat un error gràcies a @Override sobre els mètodes calcularSou en les classes filles.
		// @Override ens obliga a implementar i sobrescriure correctament un mètode de la classe pare,
		// o el compilador donarà error. 
		
		TreballadorPresencial t1 = new TreballadorPresencial("Toni", "Ferraté", 60);
		
		t1.calcularSou(160);

		t1.setNom("Josep"); // Deprecated
		t1.setCognom("Garcia"); // Deprecated
		
		System.out.println(t1.getNom() + " " + t1.getCognom());
		
		TreballadorOnline t2 = new TreballadorOnline("Miquel", "Sala", 65);
		
		System.out.println(t2.getPreuHora()); // Deprecated
		
	}
	
}
