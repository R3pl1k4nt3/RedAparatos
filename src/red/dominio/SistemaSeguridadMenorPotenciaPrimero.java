package red.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SistemaSeguridadMenorPotenciaPrimero extends SistemaSeguridad {

	public SistemaSeguridadMenorPotenciaPrimero(Red red) {
		super(red);
	}

	@Override
	protected List<Aparato> getAparatos() {
		List<Aparato> aparatos = new ArrayList<>(red.getAparatos());
		Collections.sort(aparatos, new Comparator<Aparato>() {

			@Override
			public int compare(Aparato arg0, Aparato arg1) {
				return arg0.getConsumo() - arg1.getConsumo();
			}

		});
		return aparatos;
	}

}
