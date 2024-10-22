package rest.election;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;

import rest.model.ElectionData;

@RestController
public class ElectionDataController {

    @Autowired
    private ElectionDataService service;
	
    @RequestMapping("/")
    public String warehouseMain() {
    	String mainPage = "This is the warehouse application! (DEZSYS_WAREHOUSE_REST) <br/><br/>" +
                          "<a href='http://localhost:8080/election/001/json'>Link to election/001/json</a><br/>" ;
        return mainPage;
    }

    @RequestMapping(value="/election/{inID}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public ElectionData electionData( @PathVariable int inID ) {
        return service.getElectionData( inID );
    }
    @RequestMapping(value="/election/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ElectionData electionData2( @PathVariable int inID ) {
        return service.getElectionData( inID );
    }

}