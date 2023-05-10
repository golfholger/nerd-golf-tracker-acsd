package de.itagile.golf;

import javax.naming.OperationNotSupportedException;
import java.util.Map;
import java.util.HashMap;

public class EinfacheScorecard implements Scorecard {

	private int aktuellesLoch = 1;
	private int anzahlSchlaege;
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public EinfacheScorecard() {
		map.put(1, 0);
	}
	
	public void erhoeheAnzahlSchlaege() {
		anzahlSchlaege++;
		map.put(aktuellesLoch, anzahlSchlaege);
	}

	public void schliesseLochAb() {
		aktuellesLoch++;
		anzahlSchlaege = 0;
		map.put(aktuellesLoch, anzahlSchlaege);
	}

	public int anzahlSchlaege() {
		return anzahlSchlaege;
	}

	public int aktuellesLoch() {
		return aktuellesLoch;
	}

	public Map<Integer, Integer> lochPunkte() {
		return map;
	}
	
}
