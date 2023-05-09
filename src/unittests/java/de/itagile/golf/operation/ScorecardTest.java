package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Scorecard;

class ScorecardTest {

	@Test
	void gibtInfoBeiLeererScorecard() {
		Scorecard scorecard = mock(Scorecard.class);
		when(scorecard.lochPunkte()).thenReturn(Collections.emptyMap());
		assertThat(new ScorecardAusgabe().fuehreAus(scorecard ), containsString("Du hast noch nicht gespielt."));
	}

}
