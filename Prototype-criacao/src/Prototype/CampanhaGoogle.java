package Prototype;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CampanhaGoogle implements Prototype<CampanhaGoogle>{

	private String nome;
	private Calendar vencimento;
	private List<String> palavrasChave = new ArrayList<String>();
	
	public CampanhaGoogle(String nome, Calendar vencimento, List<String> palavrasChave) {
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavrasChave = palavrasChave;
	}
	
	@Override
	public CampanhaGoogle clonar() {
		return new CampanhaGoogle(this.nome, this.vencimento, this.palavrasChave);
	}

	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		sb.append("NOME:" + this.nome+"\n");
		sb.append("VENCIMENTO:" + this.nome+"\n");
		sb.append("PALVRAS CHAVE:\n");
		
		for(String pc : this.palavrasChave){
			sb.append(pc+"\n");
		}
			
		return sb.toString();
	}
	
}
