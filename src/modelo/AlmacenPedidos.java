package modelo;

import java.io.File;

public class AlmacenPedidos<T> {

	private StringBuilder pathComun= new StringBuilder("./data/");
	
	public AlmacenPedidos(String directorio) {
		super();
		pathComun.append(directorio);
		File file = new File(pathComun.toString());
		if (!file.exists()) {
			file.mkdirs();
		}
	}
	
	/*public boolean grabar(T t,String claveElemento,String claveGrupo) {
		boolean retorno=false;
		pathComun.append("/"+claveGrupo);
		String ruta=pathComun.toString();
		pathComun.append("/"+claveElemento+".data");
		File elemento=new File(ruta);
		if(!elemento.exists()){
			retorno=elemento.mkdirs();
		}
		if(retorno)
			retorno=new DAO<>().grabar(pathComun.toString(), t);
		return retorno;
	};*/ //Esto sirve para grabar en el fichero.
}
