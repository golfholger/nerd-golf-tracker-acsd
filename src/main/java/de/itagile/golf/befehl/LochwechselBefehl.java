package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.KombiOperation;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Lochwechselausgabe;

public class LochwechselBefehl implements Befehl {

	public Operation operation() {
		KombiOperation kombiOperation = new KombiOperation(new Lochwechsel(), new Lochwechselausgabe(), new Lochausgabe());
		return kombiOperation;
	}

	public String kommando() {
		return "Nächstes Loch";
	}

	public String beschreibung() {
		return "dann zähle ich für das nächste Loch mit";
	}

}
