package domaine;

public class Propriete {
	// decla
	private String type;
	private int surface;
	private int prix;
	private Boolean disponible ;
	private String entrepreneur;
	private String ref;
	
	//TODO association bilaterale
	
private Agent AgentPropriete;
	
	
	
	//getters setters

	
	
	
	// construction

	

public String getType() {
	return type;
}


public Propriete(String type, int surface, int prix, Boolean disponible, String entrepreneur, String ref) {
	super();
	this.type = type;
	this.surface = surface;
	this.prix = prix;
	this.disponible = disponible;
	this.entrepreneur = entrepreneur;
	this.ref = ref;
	
}
public Propriete(String type, int surface, int prix, Boolean disponible, String entrepreneur, String ref,
			Agent agentPropriete) {
		super();
		this.type = type;
		this.surface = surface;
		this.prix = prix;
		this.disponible = disponible;
		this.entrepreneur = entrepreneur;
		this.ref = ref;
		AgentPropriete = agentPropriete;
	}


public void setType(String type) {
	this.type = type;
}


public int getSurface() {
	return surface;
}


public void setSurface(int surface) {
	this.surface = surface;
}


public int getPrix() {
	return prix;
}


public void setPrix(int prix) {
	this.prix = prix;
}


public Boolean getDisponible() {
	return disponible;
}


public void setDisponible(Boolean disponible) {
	this.disponible = disponible;
}


public String getEntrepreneur() {
	return entrepreneur;
}


public void setEntrepreneur(String entrepreneur) {
	this.entrepreneur = entrepreneur;
}


public String getRef() {
	return ref;
}


public void setRef(String ref) {
	this.ref = ref;
}


public Agent getAgentPropriete() {
	return AgentPropriete;
}


public void setAgentPropriete(Agent agentPropriete) {
	AgentPropriete = agentPropriete;
}


	
	
	
// methode

	// methode
	public static void reserver (String ref) {
		// to do rajouter le lien associatif pour avoir le nom de l'agent
		System.out.println(" bien reservé : "+ ref + " par " + "..." );
		
	}

	public static void voir () {
		// to do rajouter le lien associatif pour avoir le nom de l'agent

		 //test enum//
		 System.out.println(" il s'agit de voir les bien disponibles \n");
		 System.out.println("En ce moment le type de bien disponible est un "+ TypeBien.garage);
		 
	}
		
	
	@Override
	public String toString() {
		return "Propriete [type=" + type + ", surface=" + surface + ", prix=" + prix + ", disponible=" + disponible
				+ ", entrepreneur=" + entrepreneur + ", ref=" + ref + ", AgentPropriete=" + AgentPropriete
				+ ", getAgentPropriete()=" + getAgentPropriete() + "]";
	}
/*
	/TODO  affichage du prix du bien //////////////////////////////////////////
	public void affichagePrix () 
	{
	Scanner sc3 = new Scanner(System.in);
	System.out.println("entrez un prixM :");
			     int prixm = sc3.nextInt();
			     }
*/	
}

