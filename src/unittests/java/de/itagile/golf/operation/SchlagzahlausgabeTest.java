package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class SchlagzahlausgabeTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation schlagzahlausgabe = new Schlagzahlausgabe();
	
	@Test
	public void meldetEinenSchlag() throws Exception {
		when(scorecard.anzahlSchlaege()).thenReturn(1);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("1 Schlag"));
	}
	
	@Test
	public void meldetZweiSchlaegeAlsMehrzahl() throws Exception {
		when(scorecard.anzahlSchlaege()).thenReturn(2);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("2 Schläge"));
	}
	
}
