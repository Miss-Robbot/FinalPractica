package almacen;

import java.util.NavigableSet;

public class AlmacenIndividualSet<T> {
	private NavigableSet<T> conjunto;
	private String path;
	private DAO<NavigableSet<T>> dao;

	public AlmacenIndividualSet(NavigableSet<T> set, String path) {
		super();
		assert set!=null&& path!=null;
		this.conjunto = set;
		this.path = path;
		dao = new DAO<>();
	}

	/**
	 * Te devuelve el primer objeto de un conjunto
	 * @return
	 */
	public T first() {
		getSet();
		T retorno=null;
		try{
			retorno=conjunto.first();
		}catch(Exception e){
			
		}
		return  retorno;
	}
	
	/**
	 * Te devuelve el ultimo objeto de un conjunto
	 * @return
	 */
	public T last(){
		getSet();
		return conjunto.last();
	}
	
	/**
	 * Te da un objeto determinado de un conjunto
	 * @param index
	 * @return
	 */
	public T obtener(int index){
		assert index>=0;
		T t=null;
		getSet();
		if(index<conjunto.size()){
			t=(T) conjunto.toArray()[index];
		}
		return t;
	}

	/**
	 * Entra un objeto al conjunto
	 * @param t
	 * @return
	 */
	public boolean grabar(T t) {
		assert t!=null;
		boolean retorno = false;
		getSet();
		if (conjunto.add(t) && dao.grabar(path, conjunto)) {
			retorno = true;
		}
		getSet();
		return retorno;
	}

	/**
	 * Te devuelve el conjunto
	 */
	private void getSet() {
		NavigableSet<T> temporal = dao.leer(path);
		if (temporal == null) {			
			dao.grabar(path, conjunto);
		}else{
			conjunto=temporal;
		}
	}
}
