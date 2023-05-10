package de.itagile.golf.operation;

import java.util.Iterator;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;

public class ScorecardAusgabe implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		String lochausgabe = "";
		
		if (scorecard.lochPunkte().isEmpty()) {
			lochausgabe = "Du hast noch nicht gespielt.";
		} else {
			for (int i = 1; i <= scorecard.lochPunkte().size(); i++) {
				lochausgabe += i + ". Loch: " + scorecard.lochPunkte().get(i) + SystemProperties.LINE_SEPARATOR;
			}
		}
		return lochausgabe.trim();
	}

}
