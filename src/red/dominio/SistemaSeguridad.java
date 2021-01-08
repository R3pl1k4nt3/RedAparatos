package red.dominio;

import java.util.List;

public abstract class SistemaSeguridad {
	
	protected Red red;

	public SistemaSeguridad(Red red) {
		this.red = red;
	}
	
	public boolean actuar() {
		System.out.println("Empezando las comprobaciones del sistema");
		for (Aparato aparato : red.getAparatos()) {
			if (red.esEstable()) {
				System.out.println("La red se encuentra correctamente asegurada. SALIMOS");
				break;
			}
			System.err.println("Por seguridad se va a apagar: " + aparato);
			aparato.apagar();
		}
		return red.esEstable();
	}
	protected abstract List<Aparato> getAparatos() ; 
}
