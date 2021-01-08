package red.dominio;

import java.util.List;

public abstract class SistemaSeguridad {
	
	protected Red red;
	private Alarma alarma;
	
	public SistemaSeguridad(Red red, Alarma alarma) {
		this.red = red;
		this.alarma = alarma;
	}
	
	public boolean actuar() {
		
		System.out.println("Empezando las comprobaciones del sistema");
		for (Aparato aparato : getAparatos()) {
			if (red.esEstable()) {
				System.out.println("La red se encuentra correctamente asegurada. SALIMOS");
				break;
			}
			aparato.solicitudApagado();
//			if ( !(aparato instanceof AparatoCritico)) {
//				System.err.println("Por seguridad se va a apagar: " + aparato);
//				aparato.apagar();
//			}else {
//				System.out.println("Evitamos por ser critico " + aparato);
//			}
			
		}
		boolean esEstable = red.esEstable();
		if ( ! esEstable) {
			alarma.activa();
		}
		return esEstable;
	}
	protected abstract List<Aparato> getAparatos() ; 
}
