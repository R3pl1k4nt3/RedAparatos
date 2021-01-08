package red.dominio;

public class Aparato {
	private boolean encendido;

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
}
