package controlador;

import javax.swing.JComboBox;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Logica;

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

	

	public Cliente obtener(String clave){
		return logica.obtener(clave);
	}
	
	
}
