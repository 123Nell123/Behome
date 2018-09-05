package fr.gtm.behome.domaine;

public class Client {
	
// declaration
	private String nom;
	private String prenom;
	private int nbBien, idClient, idBien;

	

// getters and setters

	
	
//constructeur
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}	
	

	
public Client(int idClient) {
	super();
	this.idClient = idClient;
}



public Client(int idClient,String nom, String prenom, int nbBien,int idBien) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nbBien = nbBien;
		this.idClient = idClient;
		this.idBien = idBien;
	}


/// getteur setteurs


public Client() {
	// TODO Auto-generated constructor stub
}


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




	public int getNbBien() {
		return nbBien;
	}




	public void setNbBien(int nbBien) {
		this.nbBien = nbBien;
	}




	public int getIdClient() {
		return idClient;
	}




	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}




	public int getIdBien() {
		return idBien;
	}




	public void setIdBien(int idBien) {
		this.idBien = idBien;
	}







@Override
public String toString() {
	return "Client [idClient=" + idClient + ",nom=" + nom + ", prenom=" + prenom + ", nbBien=" + nbBien + ",  idBien="
			+ idBien + "]";
}
	
}
