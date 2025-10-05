package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import pkg.Empleado;

class EmpleadoTest {
    Empleado emp;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before ALL");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After ALL");
	}

	@BeforeEach
	void setUp() throws Exception {
		  emp = new Empleado();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After EACH");
	}
	
	
	@Test
	void testNominaBruta999() {
	    //Empleado emp = new Empleado();
	    float result = emp.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 999, 0);
	    assertEquals(2000f, result);
	}
	
	@Test
	void testNominaBruta1000() {
	    //Empleado emp = new Empleado();
	    float result = emp.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1000, 0);
	    System.out.println(result);
	    assertEquals(2100f, result);
	}
	
	@Test
	void testNominaBruta1499() {
	    //Empleado emp = new Empleado();
	    float result = emp.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1499, 0);
	    System.out.println(result);
	    assertEquals(2600f, result);
	}
	
	@Test
	void testNominaBruta1500() {
	    Empleado emp = new Empleado();
	    float result = emp.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1500, 0);
	    System.out.println(result);
	    assertEquals(2700f, result);
	}
	
	@Test
    void testNominaNeta2100() {
        float result = emp.calculoNominaNeta(2100);
        assertEquals(2100f, result, 0.01f);
    }

    @Test
    void testNominaNeta2101() {
        float result = emp.calculoNominaNeta(2101);
        assertEquals(1785.85f, result, 0.01f);
    }

    @Test
    void testNominaNeta2250() {
        float result = emp.calculoNominaNeta(2250);
        assertEquals(1912.5f, result, 0.01f);
    }

    @Test
    void testNominaNeta2499() {
        float result = emp.calculoNominaNeta(2499);
        assertEquals(2124.15f, result, 0.01f);
    }

    @Test
    void testNominaNeta2500() {
        float result = emp.calculoNominaNeta(2500);
        assertEquals(2050f, result, 0.01f);
    }



}
