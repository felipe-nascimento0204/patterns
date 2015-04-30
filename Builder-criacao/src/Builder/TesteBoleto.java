package Builder;

public class TesteBoleto {

	public static void main(String[] args) {
		
		BoletoBuilder boletoBuilder = new ItauBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		
		Boleto boleto = geradorDeBoleto.geraBoleto();
		
		System.out.println(boleto.toString());
		
	}
	
}
