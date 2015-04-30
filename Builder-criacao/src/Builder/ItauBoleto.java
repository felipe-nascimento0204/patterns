package Builder;

import java.util.Date;

public class ItauBoleto implements Boleto{

	private String sacado;
	private String cedente;
	private double valor;
	private Date vencimento;
	private int nossoNumero;
	
	public ItauBoleto(String sacado, String cedente, double valor, Date vencimento, int nossoNumero){
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}
	
	@Override
	public String getSacado() {
		return this.sacado;
	}

	@Override
	public String getCedente() {
		return this.cedente;
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public Date getVencimento() {
		return this.vencimento;
	}

	@Override
	public int nossoNumero() {
		return this.nossoNumero;
	}
	
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder () ;
		stringBuilder . append (" Boleto ITAU") ;
		stringBuilder . append ("\n") ;

		stringBuilder . append (" Sacado : " + this . sacado ) ;
		stringBuilder . append ("\n") ;

		stringBuilder . append (" Cedente : " + this . cedente ) ;
		stringBuilder . append ("\n") ;

		stringBuilder . append (" Valor : " + this . valor ) ;
		stringBuilder . append ("\n") ;

		stringBuilder . append (" Vencimento : " + this . sacado ) ;
		stringBuilder . append ("\n") ;

		stringBuilder . append (" Vencimento : " + vencimento ) ;
		stringBuilder . append ("\n") ;

		stringBuilder . append (" Nosso Número : " + this . nossoNumero ) ;
		stringBuilder . append ("\n");
		
		return stringBuilder.toString();
	}

}
