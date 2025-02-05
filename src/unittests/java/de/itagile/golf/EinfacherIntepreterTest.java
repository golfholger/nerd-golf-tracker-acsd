package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.itagile.golf.operation.Hilfe;
import de.itagile.golf.operation.KombiOperation;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Schlag;

public class EinfacherIntepreterTest {

	private Interpreter interpreter = new EinfacherInterpreter();
	
	private static Stream<Arguments> schlagParameter() {
	    return Stream.of(
	      Arguments.of("Schlage Ball", Operation.class),
	      Arguments.of("Nächstes Loch", Operation.class),
	      Arguments.of("Hilfe", Hilfe.class)
	    );
	}
	
	@ParameterizedTest
	@MethodSource("schlagParameter")
	public void interpretiertBefehle(String befehl, Class<Operation> operation) throws Exception {
		assertThat(interpreter.interpretiere(befehl), instanceOf(operation));
	}
}
