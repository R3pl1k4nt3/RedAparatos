package red.main;

import java.util.HashSet;
import java.util.Set;

import red.dominio.AlarmaSonora;
import red.dominio.Aparato;
import red.dominio.AparatoConsumoMinimoCritico;
import red.dominio.AparatoCritico;
import red.dominio.Red;
import red.dominio.SistemaSeguridad;
import red.dominio.SistemaSeguridadBasico;
import red.dominio.SistemaSeguridadMenorPotenciaPrimero;

public class Main {

	public static void main(String[] args) {
		Aparato television = new Aparato("Television", 36);
		Aparato radio = new AparatoCritico("Radio", 50);
		Aparato lavadora = new AparatoConsumoMinimoCritico("Lavadora", 30, 8);
		
		television.encender();
		radio.encender();
		lavadora.encender();

		Red miRed = new Red(60);
		miRed.addAparato(television);
		miRed.addAparato(radio);
		miRed.addAparato(lavadora);

//		System.out.println("Mi red tiene " + miRed.size() + " aparatos");
//		System.out.println("Consumo actual red = " + miRed.getConsumoActual() + "W");
//		System.out.println("Es la red estable? " + miRed.esEstable());
		
		SistemaSeguridad miSistemaSeguridad = new SistemaSeguridadMenorPotenciaPrimero(miRed, new AlarmaSonora());
		miSistemaSeguridad.actuar();
		
		System.out.println("Es la red estable? " + miRed.esEstable());
		System.out.println("El estado final de la red es: " + miRed);
	}

}
