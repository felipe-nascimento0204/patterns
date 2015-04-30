package Prototype;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteCopiaCampanhaGoogle {

	public static void main(String[] args) {
		
		
		List<String> palavrasChave = new ArrayList<String>();
		palavrasChave.add("gato");
		palavrasChave.add("cachorro");
		palavrasChave.add("macaco");
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		
		CampanhaGoogle campanhaOriginal = new CampanhaGoogle("Campanha Original", vencimento, palavrasChave);
		
		CampanhaGoogle campanhaCopia = campanhaOriginal.clonar();
		
		System.out.println(campanhaCopia.toString());
		
	}
	
}
