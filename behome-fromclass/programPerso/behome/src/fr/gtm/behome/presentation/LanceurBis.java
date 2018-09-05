package fr.gtm.behome.presentation;

import java.util.Scanner;

import fr.gtm.behome.domaine.Agent;
import fr.gtm.behome.domaine.Bien;
import fr.gtm.behome.domaine.Client;
import fr.gtm.behome.domaine.MaxiAgent;
import fr.gtm.behome.dao.AgentDao;




		public  class  LanceurBis {
			static //decalarer
			AgentDao agentDao;
			static Agent agent1;
			static Client client1;
			static Client client10;
			static Agent agent10;
		
			static MaxiAgent maxiAgent10;
			static Bien propAgent4;
			static Agent agent4 ;
		
			static Bien propriete4;
			static Agent agentPropriete4;
			
									
		
						
						
					////liee au nbre agent ///////////////////////////////////////
						public static Agent declarerA ()
						{
							
							
							
							// instancier un agents
							{
										agentDao = new AgentDao();
							
										// public Client(int idClient,String nom, String prenom, int nbBien, int idBien
										client1 = new Client(6, "Patrick", "Sebastien", 1, 1);
							
										// public Agent(int id, String nom, String prenom, int nbBien, Client client)
										agent1 = new Agent(15, "Pablo", "picasso", 4, client1);

												
												// utiliser 
												AgentDao.createAgent(agent1);
											
												System.out.println("ca commence");
												
											
								
											
												// declaration prealable
											
												// declaration pour association
											
											
											
												// initialisation
												// public Agent(int id, String nom, String prenom, int nbBien, Client client)
												
												//public Agent( int id,String nom, String prenom, Bien bienAgent)
												
												agent10 = new Agent(10,"BOB","bart");
												client10 = new Client(null, null);
												maxiAgent10 = new MaxiAgent(10,"BOB","bart");
											
												propriete4 = new Bien(null, 0, 0, null, null, null);
												propAgent4 = new Bien(null, 0, 0, null, null, null);
												agentPropriete4 = new Agent(10,"BOB","bart",propAgent4);
										}

				// utilisation
	
							
							
					
							
							
							  //*******modification de la BDD par un scanner 
							  System.out.println("creation de la base de donnee");
							  // declarer un objet dela classe AgentDao
							 
							  // remplacer l'objet agent par des objets mis a la main
							 System.out.println("entrez svp le Id du client"); 
							 Scanner sc56 = new	 Scanner(System.in); 
							 int ajoutId = sc56.nextInt();
							 agent1.setId(ajoutId);
							 
							 
							  System.out.println("entrez svp le nom du client"); 
							  Scanner sc57 = new Scanner(System.in); 
							  String ajoutNom = sc57.nextLine();
							  agent1.setNom(ajoutNom);
							 
							 System.out.println("entrez svp le prenom du client");
							 Scanner sc58 = new Scanner(System.in); 
							 String ajoutPrenom = sc58.nextLine();
							 agent1.setPrenom(ajoutPrenom);
							 
							 
							  System.out.println("entrez svp le nbre de bien du client");
							  Scanner sc59 = new Scanner(System.in); 
							  int ajoutNbBien = sc59.nextInt();
							  agent1.setNbBien(ajoutNbBien);
							  
							 
							 System.out.println("entrez svp le Id du bien");
							 Scanner sc60 = new Scanner(System.in);
							 int ajoutIdBien = sc60.nextInt(); 
							 agent1.getBienAgent();
							 
							 return agent1;
						}
						
						//////////////////////////////////////////////////////////////////////////////////////////////////
					
						
						public static void voirA (String ref) {
							System.out.println( "cher agent"+ " "+ "voici  les  "+ "proposés  :"+ ref);
						}
					
						public  static void reserver (String ref) {
							// to do rajouter le lien associatif pour avoir le nom de l'agent
							System.out.println(" bien reservé : "+ ref + " par " + "..." );
							
						}
						
						public void toucherUneCom (float com, String prenom, int NbBien) {
							float prime;
							
							prime= (float) (com *0.03) ;
							System.out.println("bravo"+" "+prenom+" pour cette vente,  "+"vous allez touché une com sur"+" "+com 
									+ ". "+ "Le nbre bien deja vendu "+" "+"est"+" " + NbBien);
					//TO DO interroge le systeme pour que l 'opérateur aie la main;
							
							System.out.println("la maison a coute"+" "+ com + "la prime touchee pour un agent est"+" "+ prime + " "+ "soit 3%" );
						
						}
	
						
						
						
		////////////////////////////

						//methode voir pour le client
							

					
							
							
							public static void choisir (String theme, String nom, String prenom ) {
								System.out.println( "Bienvenu"+" "+ nom + "  "+ prenom +" "+  "choississez votre  "+" "+ theme);
							}
								
							
							
							public static void confirmerSonInteret (String theme) {
								System.out.println( "confirmer l'interet pour le bien : "+ theme+"\n"
										+ "1. confirmer \n"+
										"2.annuler\n");
							//TODO prevenir l'agent de l'interet du client
								
							}
								
							
							public static void acheter (String id ) {
							System.out.println( " "+ "felicitation pour l'achat du bien" + "  "+ id);
							}
/////////////////////////



							public static void auditA(String string) {
								// TODO Auto-generated method stub
								// requete lien client //bien
								///////////////// requete retrouve les biens reserves par un agent et l agent
								// qui a reserver un bien particulier////////////////////////////
								System.out.println(maxiAgent10);

								System.out.println(propAgent4);
								System.out.println(agent4);
								Bien TATA;
								TATA = agent4.getBienAgent();
								System.out.println("TATA= " + agent4.getNom() + " " + TATA.getId());
							}
							
							public static void auditC(String string) {
								Agent TOTO;
								TOTO = propriete4.getAgentPropriete();
								System.out.println(TOTO);
								System.out.println(agentPropriete4);
								System.out.println(propriete4);
								System.out.println(propriete4.getId() + " " + TOTO.getNom());
							}
								
				
							}
	


