package exercici2;

public class Cotxe {
	
	
	public final static String marca = "Seat";
	public static String model;
	public final String potencia;
	
	public Cotxe() {
		model = "Ibiza";
		potencia = "100Kw";
	}
	
	
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
		
	}
	

}
