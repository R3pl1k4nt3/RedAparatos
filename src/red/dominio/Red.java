package red.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Red<T extends Aparato & Activable & ConConsumo> {
	private Set<Aparato> aparatos; // creamos set xq no queremos q se repita ningun aparato
	private final int consumoMaximo;

	public int size() {
		return getSetAparatos().size();
	}

	public int getConsumoActual() {
		int consumoActual = 0;
		for (Aparato aparato : getSetAparatos()) {
			consumoActual += aparato.getConsumoActual();
		}
		return consumoActual;
	}

	public boolean esEstable() {
		return getConsumoActual() <= consumoMaximo;
	}

	public Collection<Aparato> getAparatos() {
		return new ArrayList<>(getSetAparatos());
	}

	private Set<Aparato> getSetAparatos() {
        return aparatos;
    }
	
    public Red(int consumoMaximo) {
        aparatos = new HashSet<>();
        this.consumoMaximo = consumoMaximo;
    }
    
    public boolean addAparato(Aparato aparato) {
        System.out.println("A�adiendo " + aparato);
        return getSetAparatos().add(aparato);
    }
	   
	@Override
	public String toString() {
		return "ConsumoMaximo de la red = " + consumoMaximo + "W, con un consumo actual de = " + getConsumoActual() + "W, con los siguientes aparatos = "
				+ getAparatos();
	}
	
	
}
