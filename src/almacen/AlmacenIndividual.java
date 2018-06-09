package almacen;

import java.io.File;
import java.io.IOException;

public class AlmacenIndividual <T>{

	/**
	 * Obtiene un objeto
	 * @param path
	 * @return
	 */
	public T obtener(String path){
		return new DAO<T>().leer(path);
			
	}
	
	/**
	 * graba un objeto en el fichero
	 * @param path
	 * @param t
	 * @return
	 */
	public boolean grabar(String path,T t){
		path+="/"+t;
		File file = new File(path);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new DAO<T>().grabar(path, t);
	}
}
