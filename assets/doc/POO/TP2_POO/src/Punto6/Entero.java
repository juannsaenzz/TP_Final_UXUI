package Punto6;

public class Entero {private Integer numero;

//constructor de la clase Enteros
	public Entero (Integer numero) {
		super();
		this.numero = numero;
}

	public Integer getNumero() {
		return numero;
}

	public void setNumero(Integer numero) {
		this.numero = numero;
}

//calcula el cuadrado de n
	public Long cuadrado(){
		return Long.valueOf(numero*numero);
}

//par o impar
	public String parimpar(){
		if (numero%2 == 0) {
			return "par";
  }
		else{
			return "impar";
  }
}

//factorial
	public long factorial(){
		long resultado = 1;
		if (numero>1) {
			for (int i = numero; i > 0; i--) {
				resultado *= i;
			}
		}
		return resultado;
}

//primo
	public String primo(){
		boolean noprimo = false;
		if (numero>2) {
			for (int i = 2; i < numero; i++) {
				if (numero%i == 0) {
					noprimo = true;
				}
			} 
  }
		if (noprimo || numero==1) {
			return "no es primo";
  }
		else{
			return "es primo";
		}
	}


}
