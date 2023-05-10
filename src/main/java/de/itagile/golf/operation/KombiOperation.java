package de.itagile.golf.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class KombiOperation implements Operation {

	private List<Operation> operations;

	public KombiOperation(Operation... operation) {
		this.operations = Arrays.asList(operation);
	}

	@Override
	public String fuehreAus(Scorecard scorecard) {
		return operations.stream().map(x -> x.fuehreAus(scorecard)).collect(Collectors.joining(" "));
	}

}
