package red.dominio;

import java.util.List;

public abstract class SistemaSeguridad {
	
    private Red red;
	private Alarma alarma;
	
	protected Red getRed() {
      return red;
    }
	
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
			solicitudApagado(aparato);
//			if ( !(aparato instanceof AparatoCritico)) {
//				System.err.println("Por seguridad se va a apagar: " + aparato);
//				aparato.apagar();
//			}else {
//				System.out.println("Evitamos por ser critico " + aparato);
//			}
			
		}
		boolean esEstable = red.esEstable();
		if ( ! esEstable) {
			alarma.activar();
		}
		return esEstable;
	}
	
	protected abstract List<Aparato> getAparatos();

    public void solicitudApagado(Aparato aparato) {
        boolean resultado = aparato.setEncendido(false);
        if (resultado) {
            System.out.println("Se ignora la peticion de apagado en " + aparato);
        } else {
            System.out.println("Solicitud de apagado aceptada para el aparato " + aparato);
        }
        
    }
}
