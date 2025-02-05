package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.KombiOperation;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;

public class SchlagBefehl implements Befehl {

	public KombiOperation operation() {
		return new KombiOperation(new Schlag(), new Schlagzahlausgabe(), new Lochausgabe());
	}

	public String kommando() {
		return "Schlage Ball";
	}

	public String beschreibung() {
		return "dann zähle ich mit";
	}

}
