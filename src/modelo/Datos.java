package modelo;

import java.util.TreeMap;

import almacen.AlmacenIndice;
import almacen.AlmacenPedidos;
import utiles.Constantes;

public class Datos {

	private Constantes constantes;
	private AlmacenIndice<Cliente, String> almacen;
	private AlmacenPedidos almacenPedidos;
	private TreeMap<String, Cliente> mapaCliente= new TreeMap<>();
	
	public AlmacenIndice getAlmacen() {
		return almacen;
	}
	public void setAlmacen(AlmacenIndice almacen) {
		this.almacen = almacen;
	}
	public AlmacenPedidos getAlmacenPedidos() {
		return almacenPedidos;
	}
	public void setAlmacenPedidos(AlmacenPedidos almacenPedidos) {
		this.almacenPedidos = almacenPedidos;
	}
	
	
	public TreeMap<String, Cliente> getMapaCliente() {
		return mapaCliente;
	}
	public void setMapaCliente(TreeMap<String, Cliente> mapaCliente) {
		this.mapaCliente = mapaCliente;
	}
	/**
	 * @author macol
	 * @param cliente
	 */
	
	public void grabarCliente(Cliente cliente){
		almacen = new AlmacenIndice<>(constantes.getClientesDat(), constantes.getIndiceDat());
		almacen.grabar(cliente, cliente.getDniCif());
	}
	
	/**
	 * @author macol
	 * @param dni
	 * @return
	 */
	public Cliente obtenerCliente(String dni){
		return almacen.obtener(dni);
	}
	

}