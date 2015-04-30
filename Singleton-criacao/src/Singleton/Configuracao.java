package Singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {
	
	private static Configuracao instance;
	private Map<String, String> properties;
	
	Configuracao(){
		this.properties = new HashMap<String, String>();
		this.properties.put("time-zone", "America/Sao_Paulo");
		this.properties.put("currency-code", "BRL") ;
	}
	
	public static Configuracao getInstance(){
		if(Configuracao.instance == null){
			Configuracao.instance = new Configuracao();
		}
		return Configuracao.instance;
	}
	
	public String getProperty(String key){
		return this.properties.get(key);
	}

}
