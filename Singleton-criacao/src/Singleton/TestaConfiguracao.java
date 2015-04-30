package Singleton;


public class TestaConfiguracao {
	
	public static void main(String[] args) {
		
		Configuracao config = Configuracao.getInstance();
		
		System.out.println(config.getProperty("time-zone"));
		System.out.println(config.getProperty("currency-code"));
	}

}
