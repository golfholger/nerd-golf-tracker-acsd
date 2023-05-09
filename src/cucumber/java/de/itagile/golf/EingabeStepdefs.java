package de.itagile.golf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.Matchers.containsString;

public class EingabeStepdefs {

	private TrackerDriver tracker;

	public EingabeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}

	@When("ich eine unbekannte Eingabe mache")
	public void ich_eine_unbekannte_eingabe_mache() {
		tracker.gibEin("Beispiel für irgendwas unbekanntes");
	}

	@Then("bekomme ich einen Hinweis auf die Hilfe")
	public void bekomme_ich_einen_hinweis_auf_die_hilfe() {
		tracker.assertThatAntwort(containsString("Ich reagiere auf:"));
	}
}
