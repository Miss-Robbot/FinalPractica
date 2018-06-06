package modelo;

import java.util.TreeMap;

import almacen.AlmacenIndice;
import almacen.AlmacenPedidos;
import utiles.Constantes;

public class DatosDos {

	private Constantes constantes;
	private AlmacenIndice<Cliente, String> almacenCliente;
	private AlmacenIndice<Articulo, String> almacenArticulo;
	
	public DatosDos() {
		super();
		almacenCliente= new AlmacenIndice<>(constantes.getIndiceDat(), constantes.getClientesDat());
		almacenArticulo= new AlmacenIndice<>("articulos.index", "articulos.data"); //Esto hay que cambiarlo luego
	}
	
	public boolean grabar(Cliente cliente){
		return almacenCliente.grabar(cliente, cliente.getDniCif());
	}

	public boolean grabar(Articulo articulo){
		return almacenArticulo.grabar(articulo, articulo.getNombre());
	}
	

}