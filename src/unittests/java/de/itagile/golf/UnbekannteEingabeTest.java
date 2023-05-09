package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.itagile.golf.operation.Hilfe;

class UnbekannteEingabeTest {

	@Test
	void unbekannteEingabeWirdAlsHilfeInterpretiert() {
		Interpreter interpreter = new EinfacherInterpreter();
		assertThat(interpreter.interpretiere("Quatsch"), instanceOf(Hilfe.class));
	}

}
