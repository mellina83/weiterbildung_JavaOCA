package vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vehicles_TestfuerJUnit.Fahrzeug;

class TestFahrzeug {

	Fahrzeug fahrzeug;//null


	@BeforeEach
	void setUp() throws Exception {
		fahrzeug = new Fahrzeug(0, 144);
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void bewege() {	
		double EPSILON = 1.00;
		fahrzeug.bewege(120);//246
		assertEquals(246, fahrzeug.getPosition(),EPSILON);
	}
	@Test
	void fahren() {
		
	}
	@Test
	void springen() {
		
	}
	@Test
	void instanz() {
		assertEquals(123, fahrzeug.getGeschwindigkeit());
		assertEquals(0, fahrzeug.getPosition());
	}


}
