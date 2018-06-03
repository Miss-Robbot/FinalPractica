package controlador;

import modelo.Logica;

public class Acciones{


	private Logica logica;

	private Consultar consultar;

//	private Logica logica;
//	//private Consultar consultar;

	private Borrar borrar;
	private Insertar insertar;
	private DarAlta darAlta;
	//private Cambiar cambiar; 

	
	public Logica getLogica() {
		return logica;
	}
	public void setLogica(Logica logica) {
		this.logica = logica;
	}
}
