package spai.egit2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.Fraccion;

public class FraccionTest {
    private Fraccion fraccion;

    @Before
    public void initObjects() {
        this.fraccion = new Fraccion(2, 3);
    }

    @Test
    public void testcontructorIntInt() {
        assertEquals(2, this.fraccion.getNumerador());
        assertEquals(3, this.fraccion.getDenominador());
    }

    @Test
    public void testConstructorSinParametros() {
        Fraccion fraccion = new Fraccion();
        assertEquals(1, fraccion.getNumerador());
        assertEquals(1, fraccion.getDenominador());
    }

    @Test
    public void testSetNumerador() {
        this.fraccion.setNumerador(4);
        assertEquals(4, fraccion.getNumerador());
    }

    @Test
    public void testSetDenominador() {
        this.fraccion.setDenominador(4);
        assertEquals(4, fraccion.getDenominador());
    }

    @Test
    public void testDecimal() {
        assertEquals(2.0/3.0, fraccion.decimal(), 1e-10);
    }

	@Test
	public void testIsEquivalente() {
		Fraccion fraccionAComparar = new Fraccion(4, 6);
		assertTrue(fraccion.isEquivalente(fraccionAComparar));
	}

	@Test
	public void testIsMayor() {
		Fraccion fraccionAComparar = new Fraccion(1, 3);
		assertTrue(fraccion.isMayor(fraccionAComparar));
	}

	@Test
	public void testIsMenor() {
		Fraccion fraccionAComparar = new Fraccion(7, 4);
		assertTrue(fraccion.isMenor(fraccionAComparar));
	}

}
