package lanceur;

import java.util.ArrayList;
import java.util.Scanner;

import domaine.Agent;
import domaine.Client;
import domaine.MaxiAgent;
import domaine.Propriete;
import domaine.TypeBien;


public class MonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		// declaration prealable
		

		// declaration pour association

		Client client1 ;
		Agent agent1;

		MaxiAgent maxiAgent1;
		Propriete propAgent4;
		Agent agent4;

		Propriete propriete4;
		 Agent agentPropriete4;


		

			// initialisation
			agent1= new Agent ("BOB", null, null, 0, 0);
			client1= new Client (null, null);
			maxiAgent1= new MaxiAgent(null, null, null, 0, 0);
			
			propriete4 = new Propriete(null, 0, 0, null, null, null);
			agent4= new Agent(null, null, null, 0, 0, propriete4);
			
		
	
		
		//////*********************************************************************************************************************************************	**********
		//////****************************        debut invite de choix         **************************************		
		//**********************************************************************************************************************************************************	
		
		String status = "OnyVa";
		System.out.println("Pour sortir du programme tape (exit) a la fin d'une requete ");
			while( status ==  "OnyVa" )	
		{
			System.out.println("\n Bienvenu dans l'interface de Behom, que souhaiter vous faire? \n"
					+ "1. Accéder aux inscription  \n"
					+ "2. Consulter les biens disponibles \n"
					+ "3. Auditer (en cours )\n"
					+ "4. Quitter le programme \n"
					);
			System.out.println("**************************************************************************************");
			
			Scanner scdeb = new Scanner(System.in);
			int choix  = scdeb.nextInt();
				
					
			//TODO mettre une fonction pour appeller les fonctions correspondantes ici ou mieux redispatcher ces fonctions ds tout le programme
			
			switch(choix) {
		////**************************inscription*******************
			  case 1:
				  System.out.println("*****************menu inscription**************************");
			    System.out.println("voulez vous, \n"
			    		+ "1. Inscrire un agent (pas dispo attente BDD)\n"
			    		+ "2. Inscrire un client (pas dispo attente BDD) \n"
			    		+ "3. Ajouter un nouveau bien (pas dispo attente BDD)"
			    				);
			    System.out.println("**************************************************************************************");
			    Scanner scdeb1 = new Scanner(System.in);
				int choixInscrire  = scdeb1.nextInt();
				/// appeller declarer nbre agent
				switch(choixInscrire)
										{
				
								case 1:
								Agent.declarer();
								break;
								case 2:
									System.out.println("inscire un nouveau  client non possible sur cette version \n");
									//TODO inscrire un nouveau client cf BDD
								break;
									
								case 3:
									System.out.println("inscire un nouveau bien non possible sur cette version \n");
									//TODO inscrire un nouveau bien cf BDD
								break;
									
										}
				 status = "fini";
			    
			    break;
				////**************************consulter******************* 
			   
			    
			  case 2:
				  System.out.println(" *****************menu consulter, reserver ************************** ");
			  Propriete.voir();
			  System.out.println("voulez vous réservez ce bien ?\n"
					  +"1.oui\n"
					  +"2.non\n");
			    Scanner scdeb2 = new Scanner(System.in);
							int choixReserve  = scdeb2.nextInt();
							
							if (choixReserve == 1) 
								Propriete.reserver("garage");
							// TODO automatiser le type de bien
							else {
								System.out.println("merci de votre visite");
							}
							
			  
			  
			    
				status = "fini";
			    break;
			    
			////**************************auditer******************* 
			  case 3:
				  System.out.println(" *****************menu auditer************************** ");
				    System.out.println("que voulez vous savoir \n"
				    		+ "1. les clients d'un agent\n"
				    		+ "2. l'agent d'un client ? \n"
				    		+ "3. connaitre l'effectif Behome");
								    
								    Scanner scdeb3 = new Scanner(System.in);
								    int choixaudit = scdeb3.nextInt();
								 // utilisation	
							switch (choixaudit) {
							  case 1: System.out.println("b");
							  
							  case 2: System.out.println("c");
							  
							  case 3: System.out.println("d");
							  {
							  //TODO afficher la liste d'agent dispo
							  System.out.println("******************************************************");
							  System.out.println(" il de retrouver l'effectif chez Behome  /n");
							  ArrayList<Agent> effectif = new ArrayList<Agent>() ;
							  effectif.add(agent1);
							  effectif.add(agent4);
							  effectif.add(maxiAgent1);
				
							  int nbEffectif = effectif.size();
							  System.out.println("nbre d agent chez Behome :" + nbEffectif);
				
				
									}
								status = "fini";
								break;
			
							}
				   

							status = "fini";
				    break;
				    
			  case 4:
				  System.out.println(" *****************quitter************************** ");
				    System.out.println("confirmer votre choix en tapant (exit)\n");
				    Scanner sc1 = new Scanner(System.in);
				    
				    		      status = sc1.nextLine();	    
				    
				    break;
			  default:
			    System.out.println("Oups, le système n'est pas prévu pour ce choix");
			    
			}
			System.out.println("**************************************************************************************");
		}
		System.out.println("Aurevoir et à bientot");

//TODO for (int i=1;i<nbAgent;i++)

	



   // TODO surcharge de VoirBien pas le meme nombre d'argument
  /* voirbienClient = new VoirBien (" maison", 45,350000,true);
   voirbienAgent = new VoirBien (" maison", 45,350000,true,"GeneralBati");
   */



/*




////////////////////////////action du client /////////////////////////////////////////////
System.out.println();
client1.voir("Maison");
client1.acheter("ref15688");
System.out.println();


// requete lien client //bien
/////////////////requete retrouve les biens reserves par un agent et l agent qui a reserver un bien particulier////////////////////////////
System.out.println(maxiAgent1);


System.out.println(propAgent4);
System.out.println(agent4);
Propriete TATA;
TATA = agent4.getPropAgent(); 
System.out.println("TATA= " +agent4.getNom() +" "+ TATA.getRef());

Agent TOTO;
TOTO = propriete4.getAgentPropriete();
System.out.println(TOTO);
System.out.println(agentPropriete4);
System.out.println(propriete4);
System.out.println(propriete4.getRef()+" "+TOTO.getNom());


*/

	}
}


