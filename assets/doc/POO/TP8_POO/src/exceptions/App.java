package exceptions;

class App {
	public static void main(String args[]) {
		
		try {
			MatrizObjetos matriz = new MatrizObjetos(4, 4);
			System.out.println("La matriz se creo correctamente");
			
			matriz.add(1, 1, "Hola");
			matriz.add(1, 3, "Mundo");
			matriz.add(2, 3, 5);
			
			System.out.println(matriz);
			
			System.out.println(matriz.get(1, 1));
			
		} catch (MatrizException e) {
			System.out.println(e);
		}
		
	}
}