package de.itagile.golf;

import javax.naming.OperationNotSupportedException;
import java.util.Map;

public class EinfacheScorecard implements Scorecard {

	private int aktuellesLoch = 1;
	private int anzahlSchlaege;

	public void erhoeheAnzahlSchlaege() {
		anzahlSchlaege++;
	}

	public void schliesseLochAb() {
		aktuellesLoch++;
		anzahlSchlaege = 0;
	}

	public int anzahlSchlaege() {
		return anzahlSchlaege;
	}

	public int aktuellesLoch() {
		return aktuellesLoch;
	}

	public Map<Integer, Integer> lochPunkte() {
		throw new RuntimeException("Nich da!");
	}
}
