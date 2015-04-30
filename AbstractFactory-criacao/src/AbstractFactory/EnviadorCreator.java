package AbstractFactory;

public class EnviadorCreator {

	public Enviador create(EnumBandeira bandeira){
		
		if(bandeira == EnumBandeira.VISA){
			return new EnviadorVisa();
		}
		
		if(bandeira == EnumBandeira.MASTER_CARD){
			return new EnviadorMasterCard();
		}
		
		return null;
	}
	
}
