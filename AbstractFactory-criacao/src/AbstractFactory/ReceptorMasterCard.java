package AbstractFactory;

public class ReceptorMasterCard implements Receptor {

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem da Master Card...");
		String msg = "Pagamento aprovado";
		return msg;
	}

}
