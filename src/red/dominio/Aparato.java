package red.dominio;

public class Aparato {
	private boolean encendido;
	private final int consumo;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public int getConsumo() {
		return consumo;
	}

	public Aparato(int consumo) {

		this.consumo = consumo;
	}
	

	

	public Aparato(String nombre, int consumo) {
		super();
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return getNombre() + ", Consumo = " + getConsumo() + "W. Est� encendido? "
				+ isEncendido();
	}
	
	
}
