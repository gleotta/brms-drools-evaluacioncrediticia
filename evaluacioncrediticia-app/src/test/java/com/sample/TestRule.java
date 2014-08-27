package com.sample;

import junit.framework.TestCase;

public class TestRule extends TestCase {

//	private KieSession kSession;
//	
//	protected void setUp() throws Exception {
//		super.setUp();
//		KieServices ks = KieServices.Factory.get();
//	    KieContainer kContainer = ks.getKieClasspathContainer();
//	    kSession = kContainer.newKieSession("ksession-rules");
//
//	}
//
//	protected void tearDown() throws Exception {
//		super.tearDown();
//		kSession.dispose();
//	}
//
//	public void testRule() throws Exception {
//    	Prospecto pros = new Prospecto();
//    	pros.setTotalDeuda(0.0);
//    	pros.setCentralesRiesgo(new ArrayList<CentralRiesgo>());
//    	
//    	CentralRiesgo cr1 = new CentralRiesgo();
//    	cr1.setTotalDeuda(5.0);
//    	cr1.setProspecto(pros);
//    	
//    	CentralRiesgo cr2 = new CentralRiesgo();
//    	cr2.setTotalDeuda(15.0);
//    	cr2.setProspecto(pros);
//    	
//    	pros.getCentralesRiesgo().add(cr1);
//    	pros.getCentralesRiesgo().add(cr2);
//    	kSession.insert(pros);
//    	kSession.insert(cr1);
//    	kSession.insert(cr2);
//    	
//    	kSession.fireAllRules();
//    	System.out.println("Total Deuda: "+pros.getTotalDeuda());
//    	assertEquals(pros.getTotalDeuda(), 20.0);
//    	
//	}

}
