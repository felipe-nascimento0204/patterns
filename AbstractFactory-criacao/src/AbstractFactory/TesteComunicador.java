package AbstractFactory;

public class TesteComunicador {

	public static void main(String[] args) {
		
		ComunicadorFactory factory = new MasterCardComunicadorFactory();
		Enviador enviadorMasterCard = factory.createEnviador();
		
		String transacao = "<PAGAMENTO>"
				+"<NUMCARTAO>1212121212121</NUMCARTAO>"
				+ "<VALAOR>1000</VALOR>"
				+ "</PAGAMENTO>";
		
		enviadorMasterCard.enviar(transacao);
		
	}
	
}
