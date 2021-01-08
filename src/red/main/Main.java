package red.main;

import java.util.HashSet;
import java.util.Set;

import red.dominio.Aparato;
import red.dominio.Red;

public class Main {

	public static void main(String[] args) {
		Aparato aparato1 = new Aparato(30);
		System.out.println("Est� el aparato encendido? " + aparato1.isEncendido()); //False
		aparato1.encender();
		System.out.println("Est� el aparato encendido? " + aparato1.isEncendido()); //True
		
		System.out.println("Est� el aparato encendido? " + aparato1.isEncendido() + ". Tiene un consumo de: " + aparato1.getConsumo() + "W"); //True
		Red miRed = new Red(25);
		Set<Aparato> listaAparatos = new HashSet<>();
		miRed.addAparato(aparato1);
//		aparato1.apagar();
		
		System.out.println("Mi red tiene " + miRed.size() + " aparatos");
		System.out.println("Consumo actual red = " + miRed.getConsumoActual() + "W");
		System.out.println("Es la red estable? " + miRed.esEstable());
	}

}
