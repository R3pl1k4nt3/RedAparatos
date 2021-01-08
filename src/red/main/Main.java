package red.main;

import red.dominio.Aparato;

public class Main {

	public static void main(String[] args) {
		Aparato aparato1 = new Aparato();
		System.out.println("Está el aparato encendido? " + aparato1.isEncendido()); //False
		aparato1.encender();
		System.out.println("Está el aparato encendido? " + aparato1.isEncendido()); //True
	}

}
