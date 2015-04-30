package AbstractFactory;

public class VisaComunicadorFactory implements ComunicadorFactory {

	private EnviadorCreator enviadorCreator = new EnviadorCreator();
	private ReceptorCreator ReceptorCreator = new ReceptorCreator();
	
	@Override
	public Enviador createEnviador() {
		return enviadorCreator.create(EnumBandeira.VISA);
	}

	@Override
	public Receptor createReceptor() {
		return ReceptorCreator.create(EnumBandeira.VISA);
	}
	
}
