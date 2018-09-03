package fr.gtm.behome.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import fr.gtm.behome.domaine.Agent;
public class TestAgent {
	Agent agent1;

	@Before
	public void init() {
		System.out.println("INIT");
		agent1 = new Agent(1);
	
	}

	

	/// scenario de test ///
	// 1- ch agent a un ID
	@Test
	public void testAgentId() {

		Agent agent2 = new Agent(2);
		
		int A1 = agent1.getId();
		int A2 = agent2.getId();
		System.out.println("verifie l'incrementation des agents A1 et A2:"+ A1+" , "+ A2);
		assertNotSame("les Id des agents 1 et 2  sont identiques", A2, A1) ;
	}

	/// scenario de test ///
	// 2 ch agent a minimum un client
	@Test
	public void testAgentClientExiste() {
	
	Agent agentct = new Agent(1,"nom","prenom",1,2) ;
	System.out.println( agentct);
	System.out.println(agentct.getClient().getIdClient());
	int A=  agentct.getClient().getIdClient();
	System.out.println("valeur de l'Id");
	assertNotNull(A);
	}

	/// scenario de test ///
	// 3 ch agent peut voir les biens
	@Test
	public void testAgentBien() {

		assertFalse(true);
	}
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		