package red.dominio;

public class Aparato {
	private boolean encendido;
	private final int consumo;

	public int getConsumo() {
		return consumo;
	}

	public Aparato(int consumo) {

		this.consumo = consumo;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public void apagar() {
		encendido = false;
	}

	public void encender() {
		encendido = true;
	}
	public int getConsumoActual() {
		int consumoActual = 0;
		if (encendido) {
			consumoActual = consumo;
		}
		return consumoActual;
	}
	
}
