package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class EinfacheScorecardTest {

	private Scorecard scorecard = new EinfacheScorecard();
	
	@Test
	public void inkrementiertSchlagzahlEinmal() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();

		assertThat(scorecard.anzahlSchlaege(), is(1));
	}
	
	@Test
	public void inkrementiertSchlagzahlMehrmals() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.anzahlSchlaege(), is(2));
	}
	
	@Test
	public void setztSchlagzahlZurueck() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		assertThat(scorecard.anzahlSchlaege(), is(0));
	}
	
	@Test
	public void hatInitialErstesLoch() throws Exception {
		assertThat(scorecard.aktuellesLoch(), is(1));
	}
	
	@Test
	public void zaehltAktuellesLoch() throws Exception {
		scorecard.schliesseLochAb();
		assertThat(scorecard.aktuellesLoch(), is(2));
	}
	
	@Test
	public void lochPunkte() throws Exception {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0);
		assertThat(scorecard.lochPunkte(), is(map));
	}

	@Test
	public void lochPunktenNachEinemSchlag() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		assertThat(scorecard.lochPunkte(), is(map));
	}
	
	@Test
	public void lochPunktenNachMehrerenSchlaegen() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 3);
		assertThat(scorecard.lochPunkte(), is(map));
	}
		
	@Test
	public void lochPunktenBeimZweitenLoch() throws Exception {
		scorecard.schliesseLochAb();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0);
		map.put(2, 0);
		assertThat(scorecard.lochPunkte(), is(map));
	}
	
	@Test
	public void lochPunktenBeimDrittenLochUndMehrerenSchlaegen() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		assertThat(scorecard.lochPunkte(), is(map));
	}

}
