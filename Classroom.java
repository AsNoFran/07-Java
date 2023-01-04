public class Classroom
{
	public static void main(String[] args)
	{
		Wilder Lilia = new Wilder("Lilia");

		System.out.println("Je m'appelle  " + Lilia.getfirstname());

	
	
		Wilder Paul = new Wilder("Paul");
		Paul.setaware(true);

		System.out.println(Paul.whoAmI());

		Wilder Nicolas = new Wilder("Nicolas");
		Nicolas.setaware(false);

		System.out.println(Nicolas.whoAmI());
		
	}
}
