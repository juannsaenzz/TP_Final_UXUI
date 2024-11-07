package exceptions;

public class MatrizObjetos {

	private final int MAX_ROWS = 10;
	private final int MAX_COLS = 10;
	private  Object[][] matriz;

	public MatrizObjetos(int fila, int columna) throws MatrizException {
		
		String msg = "";
		
		if (columna >= MAX_COLS) {
			msg += MatrizException.MSG_COLUMNA;
		}
		if (fila >= MAX_ROWS) {
			msg += MatrizException.MSG_FILA;		
		}

		if (!msg.equals("")) {
			throw new MatrizException(msg);
		}
		
		this.matriz = new Object[fila][columna];
	}

	public void add(int fila, int columna, Object obj) throws MatrizException {
		try {
			matriz[fila][columna] = obj;
		} catch (Exception e) {
			throw new MatrizException(MatrizException.MSG_FUERA);
		}
	}

	public Object get(int fila, int columna) throws MatrizException {
		Object object = null;
		try {
			object = matriz[fila][columna];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new MatrizException(MatrizException.MSG_FUERA);
		}
		if (object == null) {
			throw new MatrizException(MatrizException.MSG_NO_OBJECT);
		}
		return object;
	}
	
	public String toString() {
		String staux = new String("");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				staux = staux + matriz[i][j] + " ";
			}
			staux = staux + "\n";
		}
		return staux;
	}
	
}