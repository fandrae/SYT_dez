package rest.election;

import org.springframework.stereotype.Service;
import rest.model.ElectionData;

@Service
public class ElectionDataService {
	
	public String getGreetings( String inModule ) {
        return "Greetings from " + inModule;
    }

    public ElectionData getElectionData(int inID ) {
    	
    	ElectionSimulation simulation = new ElectionSimulation();
        return simulation.getData( inID );
        
    }
    
}