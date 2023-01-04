public class Wilder
{
	//atributs
	private String firstname;
	private boolean aware;
	
	//constructeur
	public Wilder(String firstname) 
	{
        	this.firstname = firstname;
        	this.aware = true;
    	}

	// accesseurs (getters)
    	public String getfirstname() 
    	{
        	return this.firstname;
   	}

        public boolean aware() 
	{
        	return this.aware;
	}

	// mutateurs (setters)
	public void setfirstname(String firstname) 
	{
		this.firstname = firstname;
    	}

	public void setaware(boolean aware) 
	{
        	this.aware = aware;
    	}

	// méthode instanciée
    	public String whoAmI() 
	{
		if(aware == true)
		{        	
			return "Je m'appelle " + this.getfirstname() + " et je suis aware ";
    		}
		else
		{
			return "Je m'appelle " + this.getfirstname() + " et je ne suis pas aware  ";
		}
}	}
