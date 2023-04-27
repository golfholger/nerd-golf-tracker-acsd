package de.itagile.golf;

import org.hamcrest.Matchers;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BeendenStepdefs {
	private TrackerDriver tracker;
	public BeendenStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	@When("ich den NerdGolfTracker beende")
	public void ich_den_nerd_golf_tracker_beende() {
	    this.tracker.gibEin("Beenden");
	}

	@Then("bekomme ich vor dem Beenden die Nachricht {string}")
	public void bekomme_ich_vor_dem_beenden_die_nachricht(String string) {
	    this.tracker.assertThatAntwort(Matchers.is(string));
	}

}	
