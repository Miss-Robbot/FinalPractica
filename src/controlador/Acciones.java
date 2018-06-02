package controlador;

import modelo.Logica;

public class Acciones implements Accionable{


	private Logica logica;
	private Consultar consultar;

//	private Logica logica;
//	//private Consultar consultar;

	private Borrar borrar;
	private Insertar insertar;
	private DarAlta darAlta;
	//private Cambiar cambiar; 
	
	//Cualquier cambio a los métodos deberá ser implementado también en la 
	//interface
	
	@Override
	public void consultarPreciosAntiguos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void consultarArticulo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void consultarCliente() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertarLineaPedido() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cambiarPrecioArticulo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void borrarCliente() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void darAltaPedido() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void darAltaCliente() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void darAltaArticulo() {
		// TODO Auto-generated method stub
		
	}
	public Logica getLogica() {
		return logica;
	}
	public void setLogica(Logica logica) {
		this.logica = logica;
	}

	public Borrar getBorrar() {
		return borrar;
	}
	public void setBorrar(Borrar borrar) {
		this.borrar = borrar;
	}
	public Insertar getInsertar() {
		return insertar;
	}
	public void setInsertar(Insertar insertar) {
		this.insertar = insertar;
	}
	public DarAlta getDarAlta() {
		return darAlta;
	}
	public void setDarAlta(DarAlta darAlta) {
		this.darAlta = darAlta;
	}
	/*public Cambiar getCambiar() {
		return cambiar;
	}
	public void setCambiar(Cambiar cambiar) {
		this.cambiar = cambiar;
	}*/
	
	
	
}
