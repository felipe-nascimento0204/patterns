package Builder;

import java.util.Date;

public interface BoletoBuilder {

	void buildSacado(String sacado);
	void buildCedente(String cedente);
	void buildValor(double valor);
	void buildVencimento(Date vencimento);
	void buildNossoNumerro(int nossoNumero);
	Boleto getBoleto();
	
}
