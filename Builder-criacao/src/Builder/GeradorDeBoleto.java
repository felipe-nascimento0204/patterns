package Builder;

import java.util.Date;

public class GeradorDeBoleto {

	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto geraBoleto(){
		
		this.boletoBuilder.buildSacado("João da Silva");
		this.boletoBuilder.buildCedente("Mercado bem barato");
		this.boletoBuilder.buildValor(1500);
		this.boletoBuilder.buildVencimento(new Date(2015, 03, 05));
		this.boletoBuilder.buildNossoNumerro(1236);
		
		return this.boletoBuilder.getBoleto();
	}
	
}
