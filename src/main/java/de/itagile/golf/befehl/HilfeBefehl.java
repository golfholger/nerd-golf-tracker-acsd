package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.BefehleRepo;
import de.itagile.golf.operation.Hilfe;

public class HilfeBefehl implements Befehl {

	private BefehleRepo sammler;

	public HilfeBefehl(BefehleRepo sammler) {
		super();
		this.sammler = sammler;
	}

	public String kommando() {
		return "Hilfe";
	}

	public Operation operation() {
		return new Hilfe(sammler);
	}

	public String beschreibung() {
		return "dann zeige ich Dir das hier";
	}

}
