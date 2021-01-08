package red.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Red {
	private Set<Aparato> aparatos; // creamos set xq no queremos q se repita ningun aparato
	private final int consumoMaximo;

	public Red(int consumoMaximo) {
		aparatos = new HashSet<>();
		this.consumoMaximo = consumoMaximo;
	}

	public boolean addAparato(Aparato aparato) {
		System.out.println("Añadiendo " + aparato);
		return aparatos.add(aparato);
	}

	public int size() {
		return aparatos.size();
	}

	public int getConsumoActual() {
		int consumoActual = 0;
		for (Aparato aparato : aparatos) {
			consumoActual += aparato.getConsumoActual();
		}
		return consumoActual;
	}

	public boolean esEstable() {
			return getConsumoActual() <= consumoMaximo;
	}

	public Collection<Aparato> getAparatos() {
		return new ArrayList<>(aparatos);
	}

	@Override
	public String toString() {
		return "ConsumoMaximo de la red = " + consumoMaximo + "W, con un consumo actual de = " + getConsumoActual() + "W, con los siguientes aparatos = "
				+ getAparatos();
	}
	
	
}
