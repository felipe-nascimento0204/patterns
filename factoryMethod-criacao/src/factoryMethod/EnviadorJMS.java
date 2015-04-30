package factoryMethod;

import java.util.Date;

public class EnviadorJMS implements Enviador{

	@Override
	public void envia(String conteudo) {
		System.out.println("Enviado via JMS em :" + new Date()+"\n"+conteudo);
	}

}
