package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Scorecard;

public class LochwechselausgabeTest {
	
	private Scorecard scorecard = mock(Scorecard.class);
	private Lochwechselausgabe lochwechselausgabe = new Lochwechselausgabe();	

	@Test
	public void gibtZuruecksetzenAus() throws Exception {
		assertThat(lochwechselausgabe.fuehreAus(scorecard), containsString("Deine Schlagzahl wurde zurückgesetzt"));
	}
	}
