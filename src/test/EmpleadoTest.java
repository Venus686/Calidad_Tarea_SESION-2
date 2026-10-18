package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;

class EmpleadoTest {
	private Empleado emp;

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
		emp= new Empleado();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Fin de uno");
	}

	@Test
	void testEsEncargado() {
		float resultado = emp.calculoNominaBruta(Empleado.TipoEmpleado.encargado, 0, 0);
		assertEquals(2500, resultado);
	}

	@Test
	void testEsVendedor() {
		float resultado = emp.calculoNominaBruta(Empleado.TipoEmpleado.vendedor, 0, 0);
		assertEquals(2000, resultado);
	}
	
	@Test
	void testTieneHorasExtrasVendedor() {
		float resultado = emp.calculoNominaBruta(Empleado.TipoEmpleado.vendedor, 0, 1);
		assertTrue(resultado>=2030);
	}
	@Test
	void testTieneHorasExtrasEncargado() {
		float resultado = emp.calculoNominaBruta(Empleado.TipoEmpleado.encargado, 0, 1);
		assertTrue(resultado>=2530);
	}
	
	@Test
	void testVentaMesMenor1000Vendedor() {
	    float resultado = emp.calculoNominaBruta(Empleado.TipoEmpleado.vendedor, 999, 0);
	    assertEquals(2000, resultado);
	}

	@Test
	void testVentaMesMayorIgual1000Vendedor() {
		float resultado = emp.calculoNominaBruta(Empleado.TipoEmpleado.vendedor, 1100, 0);
		assertEquals(2100, resultado);
	}
	
	@Test
	void testVentaMesMayor1500Vendedor() {
		float resultado = emp.calculoNominaBruta(Empleado.TipoEmpleado.vendedor, 1510, 0);
		assertEquals(2200, resultado);
	}
	
	@Test
	void testNominaBrutaMenos2100() {
		float resultado = emp.calculoNominaNeta(2000);
		assertEquals(2000, resultado);
	}
	

	@Test
	void testNominaBrutaMayor2100Menor2500() {
		float resultado = emp.calculoNominaNeta(2200);
		assertEquals((float)(2200*(1-0.15)), resultado);
	}

	@Test
	void testNominaBrutaMayor2500() {
		float resultado = emp.calculoNominaNeta(2550);
		assertEquals((float)(2550*(1-0.18)), resultado);
	}
	
	@Test
	void testNominaBrutaNegativa() {
 		float resultado= emp.calculoNominaNeta(-1);
 		assertEquals(-1.0f, resultado, 0.001f);
	}




}
