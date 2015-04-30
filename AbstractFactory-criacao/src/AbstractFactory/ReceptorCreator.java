package AbstractFactory;

public class ReceptorCreator {

	public Receptor create(EnumBandeira bandeira){
		
		if(bandeira == EnumBandeira.VISA){
			return new ReceptorVisa();
		}
		
		if(bandeira == EnumBandeira.MASTER_CARD){
			return new ReceptorMasterCard();
		}
		
		return null;
	}
	
}
