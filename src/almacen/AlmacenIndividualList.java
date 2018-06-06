package almacen;

import java.util.AbstractList;

public class AlmacenIndividualList<T> {

	private AbstractList<T> list;
	private String path;
	private DAO<AbstractList<T>> dao;

	public AlmacenIndividualList(AbstractList<T> list, String path) {
		super();
		assert list!=null&& path!=null;
		this.list = list;
		this.path = path;
		dao = new DAO<AbstractList<T>>();
	}

	/**
	 * Obtener un objeto
	 * @param index
	 * @return
	 */
	public T obtener(int index) {
		getList();
		T retorno = null;
		if (index < list.size()) {
			retorno = list.get(index);
		}
		return retorno;

	}

	/**
	 * graba un objeto
	 * @param t
	 * @return
	 */
	public boolean grabar(T t) {
		assert t!=null;
		boolean retorno = false;
		getList();
		if (list.add(t) && dao.grabar(path, list)) {
			retorno = true;
		}
		getList();
		return retorno;
	}

	/**
	 * Obtener el fichero
	 */
	private void getList() {
		AbstractList<T> temporal = dao.leer(path);
		if (temporal == null) {
			dao.grabar(path, list);
		} else {
			list = temporal;
		}
	}
}
