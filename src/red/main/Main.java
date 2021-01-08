package red.main;

import java.util.HashSet;
import java.util.Set;

import red.dominio.Aparato;
import red.dominio.Red;
import red.dominio.SistemaSeguridad;
import red.dominio.SistemaSeguridadBasico;
import red.dominio.SistemaSeguridadMenorPotenciaPrimero;

public class Main {

	public static void main(String[] args) {
		Aparato television = new Aparato("Television" , 30);
		Aparato radio = new Aparato("Radio", 35);
		System.out.println("Está el aparato encendido? " + television.isEncendido()); //False
		television.encender();
		radio.encender();
		System.out.println("Está el aparato encendido? " + television.isEncendido()); //True
		
		System.out.println("Está el aparato encendido? " + television.isEncendido() + ". Tiene un consumo de: " + television.getConsumo() + "W"); //True
		Red miRed = new Red(40);
		Set<Aparato> listaAparatos = new HashSet<>();
		miRed.addAparato(television);
		miRed.addAparato(radio);
//		aparato1.apagar();
		
		System.out.println("Mi red tiene " + miRed.size() + " aparatos");
		System.out.println("Consumo actual red = " + miRed.getConsumoActual() + "W");
		System.out.println("Es la red estable? " + miRed.esEstable());
		SistemaSeguridad miSistemaSeguridad = new SistemaSeguridadMenorPotenciaPrimero(miRed);
		miSistemaSeguridad.actuar();
		System.out.println("Es la red estable? " + miRed.esEstable());
		System.out.println("El estado final de la red es: " + miRed);
	}

}
