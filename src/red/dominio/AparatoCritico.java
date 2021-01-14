package red.dominio;

public class AparatoCritico extends Aparato {

    @Override
    public boolean setEncendido(boolean encendido) {
        if (isEncendido()) {
            setEncendido(true);
        }
        return super.setEncendido(encendido);
    }
    
	public AparatoCritico(String nombre, int consumo) {
		super(nombre, consumo);
	}	
	
}
