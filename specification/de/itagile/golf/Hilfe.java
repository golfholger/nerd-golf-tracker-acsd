package de.itagile.golf;

import org.junit.Ignore;

import de.itagile.golf.jbehave.BaseScenario;

@Ignore("wip by Marko und Bernd")
public class Hilfe extends BaseScenario {
	
	public Hilfe() {
		addSteps(new HilfeSteps(new TrackerDriver()));
	}
}