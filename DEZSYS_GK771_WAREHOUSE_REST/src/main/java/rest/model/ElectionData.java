package rest.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ElectionData {
	
	private int regionID;
	private String regionname;
	private String regionadress;
	private int postalcode;
	private String federalstate;
	private String timestamp;
	private List<ElectionParty> countingdata;

	/**
	 * Constructor
	 */
	public ElectionData() {
		
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

	}
	
	/**
	 * Setter and Getter Methods
	 */
	public int getRegionID() {
		return this.regionID;
	}

	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}

	public String getRegionname() {
		return this.regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}

	public String getRegionadress() {
		return regionadress;
	}

	public void setRegionadress(String regionadress) {
		this.regionadress = regionadress;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public String getFederalstate() {
		return federalstate;
	}

	public void setFederalstate(String federalstate) {
		this.federalstate = federalstate;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public List<ElectionParty> getCountingdata() {
		return countingdata;
	}

	public void setCountingdata(List<ElectionParty> countingdata) {
		this.countingdata = countingdata;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Election Info: ID = %s, timestamp = %s", regionID, timestamp );
		return info;
	}
}
