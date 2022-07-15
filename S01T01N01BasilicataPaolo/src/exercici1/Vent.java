package exercici1;

public class Vent extends Instrument {

	
	
	public Vent() {
		System.out.println("S'ha inicialitzat un instrument de vent");
	}
	
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Està sonant un instrument de vent"); 
	}
	
}
