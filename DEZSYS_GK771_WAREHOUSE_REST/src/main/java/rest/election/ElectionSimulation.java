package rest.election;

import rest.model.ElectionData;
import rest.model.ElectionParty;
import rest.model.ElectionPerson;

import java.util.ArrayList;
import java.util.List;

public class ElectionSimulation {


	private double getRandomDouble(int inMinimum, int inMaximum) {
		double number = (Math.random() * ((inMaximum - inMinimum) + 1)) + inMinimum;
		double rounded = Math.round(number * 100.0) / 100.0;
		return rounded;
	}

	private int getRandomInt(int inMinimum, int inMaximum) {
		double number = (Math.random() * ((inMaximum - inMinimum) + 1)) + inMinimum;
		Long rounded = Math.round(number);
		return rounded.intValue();
	}


	public ElectionData getData(int inID) {


		ElectionData data = new ElectionData();
		data.setRegionID(inID);
		data.setRegionname("Linz Bahnhof");
		data.setRegionadress("Bahnhofsstrasse 27/9");
		data.setPostalcode(2320);
		data.setFederalstate("Linz");


		List<String> namen1 = new ArrayList<>();
		namen1.add("Anna Müller");
		namen1.add("Lukas Schmidt");
		namen1.add("Sophie Wagner");
		namen1.add("Maximilian Braun");
		namen1.add("Emma Fischer");

		List<String> namen2 = new ArrayList<>();
		namen2.add("Leon Becker");
		namen2.add("Mia Hoffmann");
		namen2.add("Felix Schneider");
		namen2.add("Laura Richter");
		namen2.add("Paul Neumann");


		List<String> namen3 = new ArrayList<>();
		namen3.add("Klara Weiß");
		namen3.add("David Krause");
		namen3.add("Elena Berger");
		namen3.add("Tom Lehmann");
		namen3.add("Marie Schulz");

		List<String> namen4 = new ArrayList<>();
		namen4.add("Jonas Mayer");
		namen4.add("Nina Bauer");
		namen4.add("Tim Seidel");
		namen4.add("Lena Friedrich");
		namen4.add("Jan König");


		List<String> namen5 = new ArrayList<>();
		namen5.add("Julia Horn");
		namen5.add("Philipp Sommer");
		namen5.add("Lisa Berg");
		namen5.add("Tobias Vogt");
		namen5.add("Hannah Wolf");


		List<ElectionParty> partys = new ArrayList<>();


		List<ElectionPerson> vorzugsstimmenOEVP = new ArrayList<>();
		vorzugsstimmenOEVP.add(new ElectionPerson(1, namen1.get(getRandomInt(0, 4)), getRandomInt(0, 100)));
		ElectionParty partyOEVP = new ElectionParty("OEVP", getRandomInt(0, 1000), null);
		partyOEVP.setVorzugsstimmen(vorzugsstimmenOEVP);
		partys.add(partyOEVP);


		List<ElectionPerson> vorzugsstimmenFPOE = new ArrayList<>();
		vorzugsstimmenFPOE.add(new ElectionPerson(1, namen2.get(getRandomInt(0, 4)), getRandomInt(0, 100)));
		ElectionParty partyFPOE = new ElectionParty("FPÖ", getRandomInt(0, 1000), null);
		partyFPOE.setVorzugsstimmen(vorzugsstimmenFPOE);
		partys.add(partyFPOE);


		List<ElectionPerson> vorzugsstimmenSPOE = new ArrayList<>();
		vorzugsstimmenSPOE.add(new ElectionPerson(1, namen3.get(getRandomInt(0, 4)), getRandomInt(0, 100)));
		ElectionParty partySPOE = new ElectionParty("SPÖ", getRandomInt(0, 1000), null);
		partySPOE.setVorzugsstimmen(vorzugsstimmenSPOE);
		partys.add(partySPOE);


		List<ElectionPerson> vorzugsstimmenGruene = new ArrayList<>();
		vorzugsstimmenGruene.add(new ElectionPerson(1, namen4.get(getRandomInt(0, 4)), getRandomInt(0, 100)));
		ElectionParty partyGruene = new ElectionParty("Grüne", getRandomInt(0, 1000), null);
		partyGruene.setVorzugsstimmen(vorzugsstimmenGruene);
		partys.add(partyGruene);

		List<ElectionPerson> vorzugsstimmenNeos = new ArrayList<>();
		vorzugsstimmenNeos.add(new ElectionPerson(1, namen5.get(getRandomInt(0, 4)), getRandomInt(0, 1000)));
		ElectionParty partyNeos = new ElectionParty("Neos", getRandomInt(0, 1000), null);
		partyNeos.setVorzugsstimmen(vorzugsstimmenNeos);
		partys.add(partyNeos);


		data.setCountingdata(partys);

		return data;
	}
}
