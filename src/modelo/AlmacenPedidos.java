package modelo;

import java.io.File;
import java.util.LinkedList;

public class AlmacenPedidos<T> {

	private StringBuilder pathComun = new StringBuilder("./data/");
	private LinkedList<Linea> lineaPedidos;

	public AlmacenPedidos(String directorio) {
		super();
		pathComun.append(directorio);
		File file = new File(pathComun.toString());
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public LinkedList<Linea> getLineaPedidos() {
		return lineaPedidos;
	}

	public void setLineaPedidos(LinkedList<Linea> lineaPedidos) {
		this.lineaPedidos = lineaPedidos;
	}

	/**
	 * Esto sirve para grabar en el fichero.
	 * 
	 * @param t
	 * @param claveElemento
	 * @param claveGrupo
	 * @return retorno
	 */
	public boolean grabar(T t, String claveElemento, String claveGrupo) {
		boolean retorno = false;
		pathComun.append(pathComun + "/" + claveGrupo);
		String ruta = pathComun.toString();
		pathComun.append(pathComun + "/" + claveElemento + ".data");
		File elemento = new File(ruta);
		if (!elemento.exists()) {
			retorno = elemento.mkdirs();
		}
		retorno = new DAO<>().grabar(pathComun.toString(), t);
		pathComun = new StringBuilder("./data/");
		return retorno;
	};

	/**
	 * Obtiene el fichero
	 * 
	 * @param claveElemento
	 * @param claveGrupo
	 * @return t
	 */
	public Object obtener(String claveElemento, String claveGrupo) {
		Object t;
		pathComun.append(pathComun + "/" + claveGrupo);
		String ruta = pathComun.toString();
		pathComun.append(pathComun + "/" + claveElemento + ".data");
		if (!new File(ruta).exists()) {
			return null;
		}
		t = new DAO<>().leer(pathComun.toString());
		pathComun = new StringBuilder("./data/");
		return t;
	};
}
