public class Hangar{
	public static void main(String[] args){
		
		//nouvelle instance
		Car lilia = new Car("Lilia");
		Boat nicolas = new Boat("Nicolas");	

		//Utilisation de getters
		System.out.println("Je suis " + lilia.getBrand() + lilia.doStuff());

		System.out.println("Je suis " + nicolas.getBrand() + nicolas.doStuff());
	}

	
}
