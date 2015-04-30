package Builder;

import java.util.Date;

public interface Boleto {

	public String getSacado();
	public String getCedente();
	public double getValor();
	public Date getVencimento();
	public int nossoNumero();
	public String toString();

}
