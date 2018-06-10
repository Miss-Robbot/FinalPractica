package controlador;

import javax.swing.JComboBox;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Logica;
import modelo.Pedido;

public class Acciones{


	private Logica logica;
	
	public Acciones(){
		logica= new Logica();
	}
	
	public Logica getLogica() {
		return logica;
	}
	public void setLogica(Logica logica) {
		this.logica = logica;
	}

	public int getNumeroArticulo() {
		return logica.getNumeroArticulo();
	}

	public boolean grabar(Articulo articulo) {
		return logica.grabar(articulo);
	}

		//Yolanda
	public int getNumeroPedido() {
		return logica.getNumeroPedido();
	}

	public boolean grabar(Pedido pedido) {
		return logica.grabar(pedido);
	}


	

	public Cliente obtener(String clave){
		return logica.obtener(clave);
	}
	
	

}
