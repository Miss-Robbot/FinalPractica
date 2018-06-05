package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.TreeMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import almacen.AlmacenMap;
import almacen.DAO;
import almacen.almacenRutaMapeada;
import modelo.Articulo;


public class almacenRutaMapeadaTest {
	private static final String DATA = "data";
	private static final String ARTICULOS = "articulos";
	private static final String ART = "art";
	private static final String ARTICULO_MAP = "articulo.map";
	almacenRutaMapeada<Articulo, String> instancia;

	@Before
	public void setUp() throws Exception {
		instancia=new almacenRutaMapeada<>(new AlmacenMap<>(new TreeMap<String, Integer>(), ARTICULO_MAP), ART, ARTICULOS, DATA);
		
	}

	@After
	public void tearDown() throws Exception {
		new DAO<>().borrar(ARTICULO_MAP);	
		new DAO<>().borrar(DATA+"/"+ARTICULOS+"/"+"0."+ART);
		new DAO<>().borrar(DATA+"/"+ARTICULOS+"/"+"1."+ART);
	}

	@Test
	public void test() {
		assertNull(instancia.obtener("uno"));
		Articulo articulo=new Articulo(instancia.obtenNumero(),"uno","uno",1f);
		assertTrue(instancia.grabar(articulo, articulo.getNombre(),articulo.getIdArticulo()));
		assertEquals(articulo, instancia.obtener(articulo.getNombre()));
		articulo=new Articulo(instancia.obtenNumero(),"dos","uno",1f);
		assertTrue(instancia.grabar(articulo, articulo.getNombre(),articulo.getIdArticulo()));
		assertEquals(articulo, instancia.obtener(articulo.getNombre()));
		articulo=new Articulo(1,"dos","uno",1f);
		assertFalse(instancia.grabar(articulo, articulo.getNombre(),articulo.getIdArticulo()));
		assertEquals(2, instancia.obtenNumero());
		assertNull(instancia.obtener("tres"));
	}

}
