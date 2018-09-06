package fr.gtm.behome.presentation;


import java.util.Scanner;

import fr.gtm.behome.dao.AgentDao;
import fr.gtm.behome.domaine.Agent;
import fr.gtm.behome.presentation.LanceurBis;


public class MonApplication {

	public static void main(String[] args) {
		//declaration
		Agent agent1, agent2;
		LanceurBis lanceurBis;
		
		// initialisaton
		//agent1 = new Agent();
		agent2 = new Agent();
		lanceurBis = new LanceurBis();
		
				

		System.out.println("Bienvenu dans l'interface de gestion Behome \n" + "Voulez vous connectez : \n"
				+ "1. En tant que Client (tapez 1) (***********attention pas encore operationnel************* \n"
				+ "2. En tant qu'Agent (tapez 2)\n");

		Scanner sc = new Scanner(System.in);
		int invite = sc.nextInt();
		//sc.close();
		switch (invite) {
		case 1:
			invite = 1;

			////// *********************************************************************************************************************************************
			////// **********
			////// **************************** debut invite de choix client
			////// **************************************
			// **********************************************************************************************************************************************************
			break;

		case 2:
			invite = 2;

			////// *********************************************************************************************************************************************
			////// **********
			////// **************************** debut invite de choix employe
			////// **************************************
			// **********************************************************************************************************************************************************

			String status = "OnyVa";
			System.out.println("Pour sortir du programme tape (exit) a la fin d'une requete ");
			while (status == "OnyVa") {
				System.out.println("\n Bienvenu dans l'interface des agents, que souhaiter vous faire? \n"
						+ "1. Gérer un agent  \n" + "2. Consulter , reverser un bien \n" + "3. Auditer   \n"
						+ "4. Quitter le programme \n");
				System.out.println(
						"**************************************************************************************");

				Scanner sc1 = new Scanner(System.in);
				int choix = sc1.nextInt();
			//	sc1.close();
				// TODO mettre une fonction pour appeller les fonctions correspondantes ici ou
				// mieux redispatcher ces fonctions ds tout le programme

				switch (choix) {
				//// **************************inscription*******************
				case 1:
					System.out.println("*****************menu inscription**************************");
					System.out.println("voulez vous: \n" 
							+ "1. Inscrire un agent \n"
							+ "2. Verifier les agents dans la base \n"
							+ "3. Modifier un agent \n"
							+ "4. Effacer un agent \n"
							+ "5. Selectioner plusieurs agents");
					System.out.println(
							"**************************************************************************************");
					Scanner sc3 = new Scanner(System.in);
					int choixInscrire = sc3.nextInt();
					//sc3.close();
					/// appeller declarer nbre agent
					switch (choixInscrire) {

					case 1:
						lanceurBis.declarerA();
						// pour renseigner un agent, la methode declarer retourne un agent qui est : agent1;
					
						System.out.println("agent1 est" + agent1);
						
						// l agent retourne est ensuite utilise dans la methode createagent;
						
						AgentDao.createAgent(agent1); 
						
						break;
					case 2:
						
						lanceurBis.declarerA();
						AgentDao.readAgent(agent1); 
						
						
						
						break;

					case 3:
						System.out.println("inscire un nouveau bien non possible sur cette version \n");
						// TODO inscrire un nouveau bien cf BDD
						lanceurBis.declarerA();
						AgentDao.update(agent1);
						
						
						
						break;
					case 4:
						
						lanceurBis.declarerA();
						AgentDao.getAllAgents(agent1); 
						
						
						
						break;
					}
					status = "fini";

					break;
				//// **************************consulter*******************

				case 2:
					System.out.println(" *****************menu consulter, reserver ************************** ");

				
					lanceurBis.voirA("garage");
					

					System.out.println("voulez vous réservez ce bien ?\n" + "1.oui\n" + "2.non\n");
					Scanner scdeb2 = new Scanner(System.in);
					int choixReserve = scdeb2.nextInt();

					if (choixReserve == 1)
						
						lanceurBis.reserver("garage");
					// TODO automatiser le type de bien
					else {
						System.out.println("merci de votre visite");
					}

					status = "fini";
					break;

				//// **************************auditer*******************
				case 3:
					System.out.println(" *****************menu auditer************************** ");
					System.out.println(
							"que voulez vous savoir \n" + "1. le(s) client(s) d'un agent ? (non operationnel) \n"
									+ "2. l'agent d'un client (non operationnel)?"
									+ "3. trouver l'effectif (non operationnel) \n");

					Scanner scdeb3 = new Scanner(System.in);
					int choixaudit = scdeb3.nextInt();
					// utilisation
					switch (choixaudit) {
					case 1:
						
						lanceurBis.auditC("MrSmith");
											
						break;
					case 2:
						
						lanceurBis.auditA("Arthur");
					
						break;

				
					case 3:

						// TODO afficher la liste d'agent dispo cad qui ont un nbre de client <10;
				
						
						
						break;
					default:
						System.out.println("choix non compris");
						status = "fini";

						break;

					}

					status = "fini";
					break;

				case 4:
					System.out.println(" *****************quitter************************** ");
					System.out.println("confirmer votre choix en tapant (exit)\n");
					Scanner sc2 = new Scanner(System.in);

					status = sc2.nextLine();
					sc2.close();
					break;
				default:
					System.out.println("Oups, le système n'est pas prévu pour ce choix");

				}
				System.out.println(
						"**************************************************************************************");
			}
			System.out.println("Aurevoir et à bientot");

			break;

		default:
			System.out.println("Nous n'avons pas compris votre demande");

		}


	}

}
