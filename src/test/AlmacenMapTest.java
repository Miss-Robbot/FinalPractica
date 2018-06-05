package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.TreeMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import almacen.AlmacenMap;
import almacen.DAO;
import modelo.Cliente;

public class AlmacenMapTest {
	private static final String MAPA_MAP = "mapa.map";
	AlmacenMap<String, String> mapa;
	Cliente Cliente=new Cliente("1", "uno", null, null);

	@Before
	public void setUp() throws Exception {
		mapa=new AlmacenMap<>(new TreeMap<>(), MAPA_MAP);
		Cliente Cliente2=new Cliente("1", "uno", null, null);
		Cliente Cliente3=new Cliente("2", "uno", null, null);
		Cliente Cliente4=new Cliente("3", "uno", null, null);
		Cliente Cliente5=new Cliente("4", "uno", null, null);
		
	}

	@After
	public void tearDown() throws Exception {
		new DAO<>().borrar(MAPA_MAP);
	}

	@Test
	public void test() {
		assertTrue(mapa.grabar(Cliente.getDniCif(), Cliente.getPedidos().toString()));
		Cliente Cliente2=new Cliente("2", "uno", null, null);
		Cliente Cliente3=new Cliente("3", "uno", null, null);
		Cliente Cliente4=new Cliente("4", "uno", null, null);
		Cliente Cliente5=new Cliente("1", "uno", null, null);
		assertTrue(mapa.grabar(Cliente2.getDniCif(), Cliente2.getPedidos().toString()));
		assertTrue(mapa.grabar(Cliente3.getDniCif(), Cliente3.getPedidos().toString()));
		assertTrue(mapa.grabar(Cliente4.getDniCif(), Cliente4.getPedidos().toString()));
		assertFalse(mapa.grabar(Cliente5.getDniCif(), Cliente5.getPedidos().toString()));
		assertEquals(Cliente2.getPedidos(), mapa.obtener(Cliente2.getDniCif().toString()));
	}

}
