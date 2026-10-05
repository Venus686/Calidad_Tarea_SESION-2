package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inicio de todo");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Fin de todo");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inicio de uno");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Fin de uno");
	}

	@Test
	void testCalculoNominaBruta() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaNeta() {
		fail("Not yet implemented");
	}

}
