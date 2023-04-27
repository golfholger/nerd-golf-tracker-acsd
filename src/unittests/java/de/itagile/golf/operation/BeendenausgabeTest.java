package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Scorecard;

public class BeendenausgabeTest {
	@Test
	public void gibBeendenNachrichtaus() throws Exception {
		Scorecard scorecard = mock(Scorecard.class);
		assertThat(new Beenden().fuehreAus(scorecard ), containsString("19. Loch"));
	}
}
