package fr.gtm.behome.domaine;


public class Agent {

// attributs
	
	private String nom;
	private String prenom;
	private int Id;
	private int NbBien;
	private float prime;
	
	//TODO bilaterale
	
private Bien bienAgent;
private Client client;
private int idClient ;

	
	
public Bien getBienAgent() {
	return bienAgent;
}
public void setBienAgent(Bien bienAgent) {
	this.bienAgent = bienAgent;
}

public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
	// getters and setters
	public  String getNom() {
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
	public int getId() {
		return Id;
	}
	public void setId(int id) {
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
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	
	// constructeur
	
	public Agent() {};
	
	
	public Agent(String nom, String prenom, int id, int nbBien, float prime) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		NbBien = nbBien;
	}

	public Agent(int id, String nom, String prenom, int nbBien) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		NbBien = nbBien;
		
		}
	
// 
		
	
	public Agent( int id,String nom, String prenom, Bien bienAgent) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		this.bienAgent = bienAgent;
	}
	
	public Agent(int id) {
	super();
	Id = id;
}
	public Agent( int id,String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;

	}
	
	public Agent(int id,String nom, String prenom,  int nbBien, int idClient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		NbBien = nbBien;
		this.idClient = idClient;
	
	}
		
	
	public Agent(String nom, String prenom, int id, int nbBien, float prime, Bien bienAgent, Client client,
			int idClient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		NbBien = nbBien;
		this.prime = prime;
		this.bienAgent = bienAgent;
		this.client = client;
		this.idClient = idClient;
	}
	public Agent(String nom, String prenom, int id, int nbBien, Client client, int idClient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		NbBien = nbBien;
		this.client = client;
		this.idClient = idClient;
	}
	public Agent(String nom, String prenom, int id, int nbBien) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		NbBien = nbBien;
		
	}
	
	
	public Agent(int id, String nom, String prenom, int nbBien, Client client) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
		NbBien = nbBien;
		this.client = client;
		
	}
	
	


	public Agent( String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;

		
	}
	
	
	
	// declaration methode
	
	
	
	//a supprimer
	
	
	
	
	@Override
	public String toString() {
		return "Agent [nom=" + nom + ", prenom=" + prenom + ", Id=" + Id + ", NbBien=" + NbBien + ", prime=" + prime
				+ ", bienAgent=" + bienAgent + ", client=" + client + ", idClient=" + idClient + "]";
	}
	public void toucherUneCom(float com) {
		// TODO Auto-generated method stub
		
	}
}
	
	

	


