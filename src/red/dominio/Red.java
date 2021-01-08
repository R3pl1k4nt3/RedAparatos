package red.dominio;

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
		return aparatos.add(aparato);
	}

	public int size() {
		return aparatos.size();
	}

	public int getConsumoActual() {
		int consumo = 0;
		for (Aparato aparato : aparatos) {
			consumo += aparato.getConsumoActual();
		}
		return consumo;
	}

	public boolean esEstable() {
		
		return getConsumoActual() <= consumoMaximo;
	}
}
