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
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("bekomme ich einen Hinweis auf die Hilfe")
	public void bekomme_ich_einen_hinweis_auf_die_hilfe() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
