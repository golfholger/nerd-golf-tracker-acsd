package de.itagile.golf;

import java.util.HashMap;
import java.util.Map;

import de.itagile.golf.operation.Hilfe;


public class EinfacherInterpreter implements Interpreter {

	private Map<String, Operation> operationen = new HashMap<>();

	public EinfacherInterpreter() {
		new BefehleSammler().sammle().forEach(befehl -> operationen.put(befehl.kommando(), befehl.operation()));
	}

	@Override
	public Operation interpretiere(String string) {
		
		return operationen.getOrDefault(string, new Hilfe(new BefehleSammler()));
	}
}
