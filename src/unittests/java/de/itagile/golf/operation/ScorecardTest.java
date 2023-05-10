package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;

class ScorecardTest {

	@Test
	void gibtInfoBeiLeererScorecard() {
		Scorecard scorecard = mock(Scorecard.class);
		when(scorecard.lochPunkte()).thenReturn(Collections.emptyMap());
		assertThat(new ScorecardAusgabe().fuehreAus(scorecard ), containsString("Du hast noch nicht gespielt."));
	}

	@Test
	void gibtScorecardAus() {
		Map map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		Scorecard scorecard = mock(Scorecard.class);
		when(scorecard.lochPunkte()).thenReturn(map);
		assertThat(new ScorecardAusgabe().fuehreAus(scorecard ), containsString("1. Loch: 1"));
	}
	
	@Test
	void gibtScorecardAusMehrereZeilen() {
		Map map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(2, 1);
		Scorecard scorecard = mock(Scorecard.class);
		when(scorecard.lochPunkte()).thenReturn(map);
		assertThat(new ScorecardAusgabe().fuehreAus(scorecard ), containsString("1. Loch: 1" + SystemProperties.LINE_SEPARATOR + "2. Loch: 1"));
	}
}
