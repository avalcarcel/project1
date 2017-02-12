
package refactory;

// Clase main que utiliza la clase CCuenta
// SaldoActual llama a la funcion operativo_cuenta(), a  esta función se le pasa el parametro 'quantitat'
// Jhonatan Valcarcel 2017
public class Main {

	public static void main(String[] args) {

		double saldoActual;
		float quantitat=12;
		
		saldoActual = operativo_cuenta(quantitat);
		System.out.println("El saldo actual es " + saldoActual);

	}


//Función que crea un objeto de la clase CCuenta y recibe la cantidad por parametro
	private static double operativo_cuenta(float quantitat) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Juan LÃ³pez", "1000-2365-85-123456789", quantitat, 0);

		saldoActual = cuenta1.estado();
		return saldoActual;
	}

}
