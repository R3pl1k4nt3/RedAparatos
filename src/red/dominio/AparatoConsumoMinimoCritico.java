package red.dominio;

public class AparatoConsumoMinimoCritico extends AparatoCritico {
	private final int consumoMinimo;
	private int consumoActual;
	
	public AparatoConsumoMinimoCritico (String nombre, int consumo, int consumoMinimo) {
		super(nombre, consumo);
		this.consumoMinimo = consumoMinimo;
	}

	@Override
	public void solicitudApagado() {
		if (isEncendido()) {
			consumoActual = consumoMinimo;
			System.out.println("Pasamos a consumo minimo " + toString());
		}
	}

	@Override
	public String toString() {
		return super.toString() + " (consumo actual " + consumoActual + ")";
	}
	

	@Override
	public boolean isEncendido() {
		
		return consumoActual > 0;
	}

	@Override
	public void apagar() {
		consumoActual = 0;
	}

	@Override
	public void encender() {
		consumoActual = getConsumo();
	}

	@Override
	public int getConsumoActual() {
		return consumoActual;
	}
	
	

	
	
	
	
}
