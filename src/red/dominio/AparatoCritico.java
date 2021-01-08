package red.dominio;

public class AparatoCritico extends Aparato {

	public AparatoCritico(String nombre, int consumo) {
		super(nombre, consumo);
	}

	@Override
	public void solicitudApagado() {
		//ignoramos la peticion de apagado al ser critico
		System.out.println("Se ignora la peticion de apagado por ser critico");
	}
	
	
}
