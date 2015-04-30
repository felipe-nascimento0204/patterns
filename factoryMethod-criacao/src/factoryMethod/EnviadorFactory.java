package factoryMethod;

public class EnviadorFactory {

	public Enviador create(EnumTipoEnviador tipoEnviador){
		if(tipoEnviador == EnumTipoEnviador.SMS){
		  return new EnviadorSMS(); 	
		} 
		if(tipoEnviador == EnumTipoEnviador.JSM){
		  return new EnviadorJMS();
		}
		return null;
	}
	
}
