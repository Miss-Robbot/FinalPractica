package almacen;

public class AlmacenIndividual <T>{

	/**
	 * Para crearme el almacen en vez del dao
	 */
	
	/**obtiene un objeto
	 * @param path
	 * @return
	 */
	public T obtener(String path){
		return new DAO<T>().leer(path);
			
	}
	
	/**
	 * Graba un objeto en el fichero
	 * @param path
	 * @param t
	 * @return
	 */
	public boolean grabar(String path,T t){
		return new DAO<T>().grabar(path, t);
	}
}
