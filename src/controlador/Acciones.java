package controlador;

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
}
