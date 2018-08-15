package domaine;

public class Agent {

// attributs
	
	private String nom;
	private String prenom;
	private String Id;
	private int NbBien;
	private float prime;
	//TODO bilaterale
	
private Propriete PropAgent ;
	
	
// getters and setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public int getNbBien() {
		return NbBien;
	}
	public void setNbBien(int nbBien) {
		NbBien = nbBien;
	}

	
	public float getPrime() {
		return prime;
	}
	public void setPrime(float prime) {
		this.prime = prime;
	}
	
	
	public Propriete getPropAgent() {
		return PropAgent;
	}
	public void setPropAgent(Propriete propAgent) {
		PropAgent = propAgent;
	}
	
	// constructeur
	public Agent(String nom, String prenom, String id, int nbBien, float prime) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		NbBien = nbBien;
	}

		
	
	public Agent(String nom, String prenom, String id, int nbBien, float prime, Propriete propAgent) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		NbBien = nbBien;
		this.prime = prime;
		PropAgent = propAgent;
	}
	// declaration methode
	
	public void voir (String theme) {
		System.out.println( "cher agent"+ " "+ getNom()+ " "+ getPrenom()+ " "+ "voici  les "+theme+" "+ "proposés  ");
	}

	
	public void toucherUneCom (float com) {
		prime= (float) (com *0.03) ;
		System.out.println("bravo"+" "+prenom+" pour cette vente,  "+"vous allez touché une com sur"+" "+com 
				+ ". "+ "Le nbre bien deja vendu "+" "+"est"+" " + getNbBien());
//TO DO interroge le systeme pour que l 'opérateur aie la main;
		
		System.out.println("la maison a coute"+" "+ com + "la prime touchee pour un agent est"+" "+ prime + " "+ "soit 3%" );
	
	}
	@Override
	public String toString() {
		return "Agent [nom=" + nom + ", prenom=" + prenom + ", Id=" + Id + ", NbBien=" + NbBien + ", prime=" + prime
				+ ", PropAgent=" + PropAgent + "]";
	}
	/*  public void getRef(Agent agent) {
		agent = Agent.getRef(PropAgent);
		// TODO Auto-generated method stub
		System.out.println(agent);
		*/
	}
	

	
	

