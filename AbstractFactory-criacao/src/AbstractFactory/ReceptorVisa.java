package AbstractFactory;

public class ReceptorVisa implements Receptor {

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem da Visa...");
		String msg = "Pagamento aprovado";
		return msg;
	}

}
