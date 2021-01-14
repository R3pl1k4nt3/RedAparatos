package red.dominio;

public class Aparato implements ConConsumo, Activable {
    public final int APAGADO = 0;
    public final int ENCENDIDO = 1;
    public final int STAND_BY = 2;
	private boolean encendido;
	private int estado = APAGADO;
	private final int consumo;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public int getConsumo() {
		return consumo;
	}

    public boolean isEncendido() {
        return encendido;
    }
    
    public boolean setEncendido(boolean encendido) {
        if (encendido) {
            setEstado(ENCENDIDO);
        } else {
            setEstado(APAGADO);
        }
        
        return getEstado() == ENCENDIDO;
    }

    public int getConsumoActual() {
        return isEncendido() ? getConsumo() : 0;
    }

    public int getEstado() {
        return estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }
    
	public Aparato(String nombre, int consumo) {
		super();
		this.nombre = nombre;
		this.consumo = consumo;
	}

	public void apagar() {
		//encendido = false;
	    setEncendido(false);
	}

	public void encender() {
		//encendido = true;
	    setEncendido(true);
	}
	
	@Override
	public String toString() {
		return getNombre() + ", Consumo = " + getConsumo() + "W. Est� encendido? " + isEncendido();
	}

}
