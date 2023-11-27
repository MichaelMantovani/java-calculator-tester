package org.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TicketTest {

	private static Ticket t = null;

	@Test
	public void goodDataTicketTest() {
		double km = 100;
		int age = 20;

		assertDoesNotThrow(() -> t = new Ticket(km, age), "Nessuna eccezione deve essere lanciata");

	}

	@Test
	public void invalidKmTicketTest() {
		double km = -1;
		int age = 20;
		assertThrows(Exception.class, () -> t = new Ticket(km, age),
				"Eccezione attesa con km negativi o uguali a zero");
	}

	@Test
	public void invalidAgeTicketTest() {
		double km = 100;
		int age = 0;
		assertThrows(Exception.class, () -> t = new Ticket(km, age),
				"Eccezione attesa con età inferiore uguale a zero o inferiore");
	}

	@Test
	public void correctPriceForMinorTicketTest() throws Exception {

		double km = 100;
		int age = 17;
		t = new Ticket(km, age);
		assertEquals(16.8, t.getPrice(), "Il prezzo non è giusto");
	}

	@Test
	public void correctPriceForElderlyTicketTest() throws Exception {

		double km = 100;
		int age = 68;
		t = new Ticket(km, age);
		assertEquals(12.6, t.getPrice(), "Il prezzo non è giusto");
	}

	@Test
	public void correctPriceWithoutDiscountTicketTest() throws Exception {

		double km = 100;
		int age = 50;
		t = new Ticket(km, age);
		assertEquals(21, t.getPrice(), "Il prezzo non è giusto");
	}

}
