package lanceur;

import java.util.ArrayList;
import java.util.Scanner;

import domaine.Agent;
import domaine.Client;
import domaine.MaxiAgent;
import domaine.Propriete;



public class MonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("commencer par renseigner les effectifs");
System.out.println();
System.out.println("combien d'agent souhaite vous declarer?");		
Scanner sc = new Scanner(System.in);
int nbAgent = sc.nextInt();

System.out.println(nbAgent);


//for (int i=1;i<nbAgent;i++)

	
// declaration

Client client1 ;
Agent agent1;

MaxiAgent maxiAgent1;
Propriete propAgent4;
Agent agent4;

Propriete propriete4;
 Agent agentPropriete4;




// instanciation

 Scanner sc1 = new Scanner(System.in);
 System.out.println("entrez le nom de l'agent :");
 		     String nomA = sc1.nextLine();
 
 
 
 client1 = new Client("Franck", nomA) ;
agent1 = new Agent ("Mr Biloute", "Smith","007",2, 8) ;



propAgent4 = new Propriete("F2", 30, 30000, true, "Marx", "1300P6");
agent4 = new Agent ("nomA", "revolv", "007", 1, 2, propAgent4) ;

maxiAgent1 = new MaxiAgent ("Ford","Henri","006", 4, 0) ;

agentPropriete4 = new Agent ("Mr Popeye", "Smith","007",2, 8) ;
propriete4 = new Propriete("F2", 30, 30000, true, "Marx", "1300P6", agentPropriete4 );


   // TODO surcharge de VoirBien pas le meme nombre d'argument
  /* voirbienClient = new VoirBien (" maison", 45,350000,true);
   voirbienAgent = new VoirBien (" maison", 45,350000,true,"GeneralBati");
   */


// utilisation	

//TODO afficher la liste d'agent dispo

ArrayList<Agent> effectif = new ArrayList<Agent>() ;
effectif.add(agent1);
effectif.add(agent4);
effectif.add(maxiAgent1);

int nbEffectif = effectif.size();
System.out.println("nbre d agent chez Behome :" + nbEffectif);




/*
/////affichage du prix du bien //////////////////////////////////////////
Scanner sc3 = new Scanner(System.in);
System.out.println("entrez un prixM :");
		     int prixm = sc3.nextInt();

////determination des commissions par agent //////////////////////////////////////////
System.out.println();
agent1.voir("Biens");
agent1.toucherUneCom(prixM);
maxiAgent1.toucherUneCom(prixM);

////////////////////////////action du client /////////////////////////////////////////////
System.out.println();
client1.voir("Maison");
client1.acheter("ref15688");
System.out.println();



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


