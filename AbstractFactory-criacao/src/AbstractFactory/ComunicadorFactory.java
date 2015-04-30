package AbstractFactory;

public interface ComunicadorFactory {
	public Enviador createEnviador();
	public Receptor createReceptor();
}
