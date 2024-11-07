package exceptions;

public class MatrizException extends Exception {
	
	public static final String MSG_COLUMNA = "Excede el numero de columnas";
			//Mensajes.getInstance().getMensaje("matriz.columnas.error");
	public static final String MSG_FILA = "Excede el numero de filas";
			//Mensajes.getInstance().getMensaje("matriz.filas.error");
	public static final String MSG_NO_OBJECT = "No se encontro un objeto";
			//Mensajes.getInstance().getMensaje("matriz.noobject.error");
	public static final String MSG_FUERA = "Fuera de la matriz";
			//Mensajes.getInstance().getMensaje("matriz.fuera.error");
	
	private String name;

	public MatrizException(String name) {
		this.name = name;
	}

	public String toString() {
		return "ERROR MATRIZ :" + name;
	}
}