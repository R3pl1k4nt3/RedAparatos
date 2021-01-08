package red.main;

import java.util.HashSet;
import java.util.Set;

import red.dominio.Aparato;
import red.dominio.AparatoCritico;
import red.dominio.Red;
import red.dominio.SistemaSeguridad;
import red.dominio.SistemaSeguridadBasico;
import red.dominio.SistemaSeguridadMenorPotenciaPrimero;

public class Main {

	public static void main(String[] args) {
		Aparato television = new Aparato("Television", 36);
		Aparato radio = new AparatoCritico("Radio", 35);
		
		television.encender();
		radio.encender();

		Red miRed = new Red(45);
		miRed.addAparato(television);
		miRed.addAparato(radio);

//		System.out.println("Mi red tiene " + miRed.size() + " aparatos");
//		System.out.println("Consumo actual red = " + miRed.getConsumoActual() + "W");
//		System.out.println("Es la red estable? " + miRed.esEstable());
		
		SistemaSeguridad miSistemaSeguridad = new SistemaSeguridadMenorPotenciaPrimero(miRed);
		miSistemaSeguridad.actuar();
		
		System.out.println("Es la red estable? " + miRed.esEstable());
		System.out.println("El estado final de la red es: " + miRed);
	}

}
