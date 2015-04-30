package AbstractFactory;

public class EnviadorVisa implements Enviador {

	@Override
	public void enviar(String transacao) {
		System.out.println("Enviando mensagem para Visa...");
	}

	
}
