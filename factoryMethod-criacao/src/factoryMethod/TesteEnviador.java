package factoryMethod;

public class TesteEnviador {

	public static void main(String[] args) {
		
		EnviadorFactory factory = new EnviadorFactory();
		
		Enviador enviadorSMS = factory.create(EnumTipoEnviador.SMS);
		enviadorSMS.envia("Hello, SMS");
		
		Enviador enviadorJMS = factory.create(EnumTipoEnviador.SMS);
		enviadorJMS.envia("Hello, JMS");
		
	}
}
