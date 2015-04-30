package AbstractFactory;

public class EnviadorMasterCard implements Enviador{

	@Override
	public void enviar(String transacao) {
		System.out.println("Enviando mensagem para MasterCard...");
	}

}
