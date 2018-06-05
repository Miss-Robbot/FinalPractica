package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import almacen.AlmacenIndice;
import modelo.Cliente;

public class AlmacenIndiceTest {

	private static final String CLIENTES_DAT = "clientes.dat";
	private static final String INDICE_DAT = "indice.dat";
	AlmacenIndice<Cliente, String> instancia;
	
	@Before
	public void setUp(){
		instancia=new AlmacenIndice<>(INDICE_DAT, CLIENTES_DAT);
		
	}
	
	@Test
	public void testObtener() {
		Cliente cliente=new Cliente("1", "josefo", "calle", "5");
		instancia.grabar(cliente,cliente.getDniCif());
		Cliente cli2=new Cliente("6", "arturo", null, null);
		instancia.grabar(cli2, cli2.getDniCif());
		Cliente cli3=new Cliente("6", "arturo", null, null);
		instancia.grabar(cli3, cli3.getDniCif());
		assertEquals(cli2, instancia.obtener(cli2.getDniCif()));
		assertEquals(cli3, instancia.obtener(cli3.getDniCif()));
		assertNull(instancia.obtener("no"));
		Cliente cli4=new Cliente("3", "pedro", null, null);
		instancia.grabar(cli4, cli4.getDniCif());
	}

	@Test
	public void testGrabar() {
		Cliente cliente=new Cliente("1", "josefo", null, null);
		assertTrue(instancia.grabar(cliente,cliente.getDniCif()));
		Cliente cli2=new Cliente("2", "arturo", null, null);
		assertTrue(instancia.grabar(cli2, cli2.getDniCif()));
		Cliente cli=instancia.obtener(cliente.getDniCif());
		assertEquals(cli,cliente);
	}
	
	@Test 
	public void testborrar(){
		Cliente cliente=new Cliente("4", "josefo", null, null);
		assertTrue(instancia.grabar(cliente,cliente.getDniCif()));
		Cliente cli2=new Cliente("1", "arturo", null, null);
		assertTrue(instancia.grabar(cli2, cli2.getDniCif()));
		Cliente cli3=new Cliente("7", "felipe", null, null);
		assertTrue(instancia.grabar(cli3, cli3.getDniCif()));
		Cliente cli4=new Cliente("3", "froliam", null, null);
		assertTrue(instancia.grabar(cli4, cli4.getDniCif()));
		System.out.println(instancia.obtener("3").getPedidos());
		instancia.borrar("7");
		System.out.println(instancia.obtener("4").getPedidos());
		System.out.println(instancia.obtener("1").getPedidos());
		assertNotNull(instancia.obtener("3"));
		System.out.println("ultimo"+ instancia.obtener("3").getPedidos());
		
	}
	@After
	public void tearDown(){
		File file=new File(INDICE_DAT);
		file.delete();
		file=new File(CLIENTES_DAT);
		file.delete();
	}
}
