package validacion;

public class Validador {

	public boolean validarArticulo(String nombre, String proveedor, String descripcion, int cantidad){
		if(validarString(nombre) && validarString(proveedor) && validarString(descripcion) && validarInt(cantidad)){
			return true;
		}
		return false;
	}
	//Yolanda
	public boolean validarPedido(String NIF, String IdArticulo, int cantidad){
		if(validarString(NIF) && validarString(IdArticulo) && validarInt(cantidad)){
			return true;
		}
		return false;
	}
	
	private boolean validarString(String nombre){
		if(nombre==null)
			return false;
		if(nombre.equals(""))
			return false;
		if(nombre.length()<3)
			return false;
		return true;
	}
	
	private boolean validarInt(int cantidad){
		if(cantidad<0)
			return false;
		return true;
	}
}
