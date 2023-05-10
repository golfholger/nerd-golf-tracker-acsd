package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

class KombiOperationenTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation stubOperationAnfang = mock(Operation.class);
	private Operation stubOperationEnde = mock(Operation.class);
	
	@Test
	void shouldReturnEmptyStringWithNoOperation() {
		KombiOperation objectUnderTest = new KombiOperation();
		
		assertThat(objectUnderTest.fuehreAus(scorecard), is(emptyString()));
	}
	
	@Test
	void shouldReturnOperationResultFromOneOperation() throws Exception {
		KombiOperation objectUnderTest = new KombiOperation(stubOperationAnfang);
		Mockito.when(stubOperationAnfang.fuehreAus(scorecard)).thenReturn("Hallo Welt");
		
		assertThat(objectUnderTest.fuehreAus(scorecard), is("Hallo Welt"));
	}

	@Test
	void shouldReturnOperationsResultFromMoreOperation() throws Exception {
		KombiOperation objectUnderTest = new KombiOperation(stubOperationAnfang, stubOperationEnde);
		Mockito.when(stubOperationAnfang.fuehreAus(scorecard)).thenReturn("Hallo");
		Mockito.when(stubOperationEnde.fuehreAus(scorecard)).thenReturn("Welt");
		
		assertThat(objectUnderTest.fuehreAus(scorecard), is("Hallo Welt"));
	}
}
