package modelo;

import java.util.ArrayList;

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

	public ArrayList<Articulo> getListaArticulos() {
		return dato.getListaArticulos();
	}
	
	//Yolanda
	public int getNumeroPedido() {
		return dato.getNumeroPedido();
	}
	
	public boolean grabar(Pedido pedido) {
		return dato.grabar(pedido);
	}

}
