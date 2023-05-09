package de.itagile.golf;

import java.util.Map;

public interface Scorecard {

	void erhoeheAnzahlSchlaege();

	int anzahlSchlaege();

	void schliesseLochAb();

	int aktuellesLoch();

	Map<Integer, Integer> lochPunkte();

}