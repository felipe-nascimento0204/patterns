package AbstractFactory;

public class MasterCardComunicadorFactory implements ComunicadorFactory{

	private EnviadorCreator enviadorCreator = new EnviadorCreator();
	private ReceptorCreator ReceptorCreator = new ReceptorCreator();
	
	@Override
	public Enviador createEnviador() {
		return enviadorCreator.create(EnumBandeira.MASTER_CARD);
	}

	@Override
	public Receptor createReceptor() {
		return ReceptorCreator.create(EnumBandeira.MASTER_CARD);
	}

}
