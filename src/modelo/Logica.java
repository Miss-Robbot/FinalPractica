package modelo;

import java.util.ArrayList;

import javax.swing.JTextArea;


public class Logica {

	private Datos dato;

	public Logica() {
		dato = new Datos();
	}

	public Datos getDato() {
		return dato;
	}

	public void setDato(Datos dato) {
		this.dato = dato;
	}

	public int getNumeroArticulo() {
		return dato.getNumeroArticulo();
	}

	public boolean grabar(Articulo articulo) {
		return dato.grabar(articulo);
	}

	public boolean grabar(Cliente cliente) {
		return dato.grabar(cliente);
		
	}
	
	public ArrayList<Articulo> getListaArticulos() {
		return dato.getListaArticulos();
	}
	

	//Yolanda
	public int getNumeroPedido() {
		return dato.getNumeroPedido();
	}
	
	
	public void aumentarNumeroPedido() {
		dato.aumentarNumeroPedido();
	}
	public boolean grabar(Pedido pedido) {
		return dato.grabar(pedido);
	}

	public float getPrecioActual(){
		ArrayList<Articulo> articulos= dato.getListaArticulos();
		return articulos.get(0).getPrecios().getFirst().getPrecio();
	}

	public Cliente crearCliente(String dni, String nombre, String dire, String tlf) {
		Cliente client = new Cliente(dni, crearDatos(dni, nombre, dire, tlf));
		dato.grabarCliente(client);
		dato.setIndex(dato.getIndex()+1);
		return client;
	}

	private String crearDatos(String dni, String nombre, String dire, String tlf) {
		return " "+nombre+": \n DNI/NIF: "+dni+". \n Direccion: "+dire+". \n Tlf: "+tlf;
	}

	public Cliente obtener(String clave){
		return dato.obtener1(clave);
	}

	public String conseguirInfo(Cliente cliente) {
		return cliente.getDatos();
	}
}
