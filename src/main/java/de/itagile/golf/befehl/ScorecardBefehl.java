package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.ScorecardAusgabe;

public class ScorecardBefehl implements Befehl {

	@Override
	public String kommando() {
		return "Scorecard";
	}

	@Override
	public Operation operation() {
		return new ScorecardAusgabe();
	}

	@Override
	public String beschreibung() {
		return "dann zeige ich dir die Scorecard an";
	}

}
