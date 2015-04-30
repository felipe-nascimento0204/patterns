package Builder;

import java.util.Date;

public class ItauBoletoBuilder implements BoletoBuilder {
	
	private String sacado;
	private String cedente;
	private double valor;
	private Date vencimento;
	private int nossoNumero;

	@Override
	public void buildSacado(String sacado) {
		this.sacado = sacado;
	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente = cedente;
	}

	@Override
	public void buildValor(double valor) {
		this.valor = valor;
		
	}

	@Override
	public void buildVencimento(Date vencimento) {
		this.vencimento = vencimento;
		
	}

	@Override
	public void buildNossoNumerro(int nossoNumero) {
		this.nossoNumero = nossoNumero;
		
	}

	@Override
	public Boleto getBoleto() {
		return new ItauBoleto(this.sacado, this.cedente, this.valor, this.vencimento, this.nossoNumero);
	}
	
	

}
