package Composite;

import java.util.ArrayList;
import java.util.List;

public class Caminho implements Trecho {

	List<Trecho> trechos = new ArrayList<Trecho>();
	
	@Override
	public void imprime() {
		for(Trecho trecho : this.trechos){
			trecho.imprime();
		}
	}
	
	public List<Trecho> getTrechos() {
		return trechos;
	}
	
}
