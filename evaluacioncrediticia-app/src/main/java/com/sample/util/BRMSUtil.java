package com.sample.util;

import java.util.Collection;

import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

public class BRMSUtil {

    private KieContainer kContainer = null;
    
    private BRMSUtil() {	    
    	
    	KieServices kServices = KieServices.Factory.get();

		ReleaseId releaseId = kServices.newReleaseId( "com.redhat", "evaluacioncrediticia", "1.0" );

		kContainer = kServices.newKieContainer( releaseId );

		//KieScanner kScanner = kServices.newKieScanner( kContainer );
	

		// Start the KieScanner polling the maven repository every 10 seconds

		//kScanner.start( 10000L );
    }
    
    private static BRMSUtil instance;
    
    public static final BRMSUtil getInstance() {
    	if (instance==null) {
    		instance= new BRMSUtil();
    	}
    	return instance;
    }


    
    public StatelessKieSession getStatelessSession() {

        return kContainer.newStatelessKieSession();

    }

    /*
     * KieSession is the new StatefulKnowledgeSession from BRMS 5.3.
     */
    public KieSession getStatefulSession() {

        return kContainer.newKieSession();

    }
    
    public static void dispose() {
    	Collection<KieSession> sesiones = (Collection<KieSession>) instance.kContainer.getKieBase().getKieSessions();
    	for (KieSession kieSession : sesiones) {
			kieSession.dispose();
			kieSession.destroy();
		}
    	
    	
    }

}
