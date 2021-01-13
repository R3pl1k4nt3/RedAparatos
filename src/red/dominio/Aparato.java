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

	public Aparato(String nombre, int consumo) {
		super();
		this.nombre = nombre;
		this.consumo = consumo;
	}

	public boolean isEncendido() {
		return encendido;
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
		return getNombre() + ", Consumo = " + getConsumo() + "W. Está encendido? " + isEncendido();
	}

	public void solicitudApagado() {
		System.out.println("Solicitud de apagado aceptada para el aparato " + this.toString());
		apagar();
		
	}

}
