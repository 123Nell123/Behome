package domaine;

public class Client {
	
// declaration
	private String nom;
	private String prenom;

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
//constructeur
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}	
	


//methode voir
	
	public void voir (String theme) {
		System.out.println( "Bienvenu"+" "+ getNom() + "  "+ getPrenom() +" "+  "choississez votre  "+" "+ theme);
	}
	
	public void acheter (String id) {
	System.out.println(getPrenom() + " "+ "felicitation pour l'achat du bien" + "  "+ id);
	}
/*
	/TODO determination des commissions par agent //////////////////////////////////////////
	
	public void determinationcom() {
	System.out.println();
	agent1.voir("Biens");
	agent1.toucherUneCom(prixM);
	maxiAgent1.toucherUneCom(prixM);
	}
	*/
	
}
