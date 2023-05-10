package de.itagile.golf;

import java.io.IOException;

import de.itagile.golf.konsole.Konsole;
import de.itagile.golf.operation.KombiOperation;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Startausgabe;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Konsole konsole = new Konsole();
		
		KombiOperation startoperation = new KombiOperation(new Startausgabe(), new Lochausgabe());
		Tracker tracker = new Tracker(new EinfacherInterpreter(), startoperation);

		konsole.println(tracker.starte()).beendeAusgabe();
		boolean isBeendet = false;
		while (!isBeendet) {
			String befehl = konsole.liesZeileEin();
			if("Beenden".equals(befehl))
				isBeendet = true;
			konsole.println(tracker.reagiereAuf(befehl)).beendeAusgabe();
		}
	}
}