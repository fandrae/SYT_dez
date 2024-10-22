package rest.model;

import java.util.ArrayList;
import java.util.List;

public class ElectionParty {
    private String partyID;
    private int votes;
    private List<ElectionPerson> vorzugsstimmen;

    public ElectionParty(String partyID, int votes, ElectionPerson vorzugsstimmen) {
        this.partyID = partyID;
        this.votes = votes;
        this.vorzugsstimmen = new ArrayList<ElectionPerson>();
    }
    public String getParty() {
        return partyID;
    }

    public void setParty(String partyID) {
        this.partyID = partyID;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public List<ElectionPerson> getVorzugsstimmen() {
        return vorzugsstimmen;
    }

    public void setVorzugsstimmen(List<ElectionPerson> vorzugsstimmen) {
        this.vorzugsstimmen = vorzugsstimmen;
    }

    public String toString() {

        String info = String.format("Election Info: ID = %s, timestamp = %s", votes, partyID );
        return info;
    }
}
