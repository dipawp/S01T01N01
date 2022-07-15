package exercici1;

public abstract class Instrument {
	
	private String nom;
	private int preu;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	
	
	public abstract void tocar();
	
	
	
	public static void main(String args[]) {
		
		{Corda corda2 = new Corda();}
	}
	
	static { Vent vent = new Vent();}

}
