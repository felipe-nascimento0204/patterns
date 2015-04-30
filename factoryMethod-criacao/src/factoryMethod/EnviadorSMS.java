package factoryMethod;

import java.util.Date;

public class EnviadorSMS implements Enviador{

	@Override
	public void envia(String conteudo) {
		System.out.println("Enviado via SMS em :" + new Date()+"\n"+conteudo);
	}

	

}
