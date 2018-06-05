package almacen;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

	
	public class DAO<T> {
		
	/**
	 * Se le entra la ruta que quieren leer y llama al método leer. Este método es el que usan las otras clases para leer un fichero.
	 * @param path
	 * @return
	 */
	public T leer(String path) {
		return leer(path, 0);
	}

	/**
	 * Es el método que se encarga de leer un fichero entero.
	 * @param path
	 * @param posicion
	 * @return
	 */
	public T leer(String path, int posicion) {
		assert path != null && posicion >= 0;
		T t = null;
		FileInputStream flujoR = abrir(path);
		if (flujoR != null) {
			try {
				ObjectInputStream adaptador = new ObjectInputStream(flujoR);
				for (int i = 0; i <= posicion; i++) {
					t = (T) adaptador.readObject();
				}
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
				t = null;
			}
			cerrarFlujo(flujoR);
		}
		return t;
	}

	/**
	 * Es el método que usan las otras clases para grabar un objeto en un fichero
	 * @param path
	 * @param t
	 * @return
	 */
	public boolean grabar(String path, T t) {
		return grabar(path, t, false);
	}

	/**
	 * Es el método grabar que entra en una ruta path un objeto t.
	 * @param path
	 * @param t
	 * @param adicion
	 * @return
	 */
	public boolean grabar(String path, T t, boolean adicion) {
		assert path != null && t != null;
		boolean retorno = true;
		File file = new File(path);
		boolean existe = file.exists() && adicion;
		FileOutputStream flujoW = abrir(path, adicion);
		try {
			ObjectOutputStream adaptador = null;
			if (existe) {
				adaptador = new MyObjectOutputStream(flujoW);
			} else {
				adaptador = new ObjectOutputStream(flujoW);
			}
			adaptador.writeObject(t);
		} catch (IOException e) {
			e.printStackTrace();
			retorno = false;
		}
		boolean cierreFalso = cerrarFlujo(flujoW);
		if (retorno)
			retorno = cierreFalso;
		return retorno;
	}

	/**
	 * Abre el fichero para poder grabar o leer de el
	 * @param path
	 * @return
	 */
	private FileInputStream abrir(String path) {
		FileInputStream flujoR = null;
		File file = new File(path);
		try {
			if (file.exists()) {
				flujoR = new FileInputStream(path);
			}
		} catch (FileNotFoundException e) {
		}
		return flujoR;
	}

	/**
	 * Abre un flujo
	 * @param path
	 * @param adicion
	 * @return
	 */
	private FileOutputStream abrir(String path, boolean adicion) {
		// no hay assert porque ya habria saltado en el public
		FileOutputStream flujoW = null;
		File file = new File(path);
		try {
			flujoW = new FileOutputStream(file, adicion);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return flujoW;

	}

	/**
	 * Para cerrar el flujo
	 * @param closeable
	 * @return
	 */
	private boolean cerrarFlujo(Closeable closeable) {
		boolean retorno = true;
		try {
			closeable.close();
		} catch (IOException e) {
			retorno = false;
		}
		return retorno;
	}

	class MyObjectOutputStream extends ObjectOutputStream {

		public MyObjectOutputStream(OutputStream out) throws IOException {
			// quiero que se quede como esta
			super(out);
		}

		@Override
		protected void writeStreamHeader() throws IOException {
			// Este es el que escribe la cabecera
			/*
			 * La solucion pasa por eliminar la escritura de la cabecera para
			 * objetos de mi tipo
			 */
			// super.writeStreamHeader();
			// System.out.println("soy la otra");
		}
	}

	/**
	 * Borra un fichero
	 * @param rutaarchivo
	 */
	public void borrar(String rutaarchivo) {
		File file = new File(rutaarchivo);
		file.delete();
	}

	/**
	 * borra un elemento de un fichero
	 * @param pathDatos
	 * @param posicion
	 * @return
	 */
	public boolean borrarElemtento(String pathDatos, Integer posicion) {
		int i = 0;
		boolean retorno=true;
		T t = leer(pathDatos, i);
		while (t != null) {
			if (i != posicion) {
				grabar("copia", t, true);
			}
			i++;
			t = leer(pathDatos, 0);
		}
		File original=new File(pathDatos);
		File copia=new File("copia");
		if(original.delete()&&copia.renameTo(original)){
			retorno=false;
		}
		return retorno;
	}
}