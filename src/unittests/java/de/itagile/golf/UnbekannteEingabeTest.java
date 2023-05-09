package de.itagile.golf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnbekannteEingabeTest {

	@Test
	void unbekannteEingabeWirdAlsHilfeInterpretiert() {
		Interpreter interpreter = new EinfacherInterpreter();
		interpreter.interpretiere(null);
		fail("Not yet implemented");
	}

}
