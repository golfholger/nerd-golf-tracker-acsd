package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;

public class ScorecardBefehl implements Befehl {

	@Override
	public String kommando() {
		// TODO Auto-generated method stub
		return "Scorecard";
	}

	@Override
	public Operation operation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String beschreibung() {
		// TODO Auto-generated method stub
		return "dann zeige ich dir die Scorecard an";
	}

}
