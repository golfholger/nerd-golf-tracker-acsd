package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Schlagzahlausgabe implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		int anzahlSchlaege = scorecard.anzahlSchlaege();
		String vorlage = "Du hast %d %s";
		return String.format(vorlage, 
							 scorecard.anzahlSchlaege(), 
							 anzahlSchlaege < 2 ? "Schlag" : "Schläge");
	}
}
