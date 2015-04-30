package Bridge;

public class Recibo implements Documento{

	private String favorecido;
	private String benefiado;
	private double valor;
	private GeradorDeArquivo geradorDeArquivo;
	
	public Recibo(String favorecido, String benefiado, double valor, GeradorDeArquivo geradorDeArquivo) {
		this.favorecido = favorecido;
		this.benefiado = benefiado;
		this.valor = valor;
		this.geradorDeArquivo = geradorDeArquivo;
	}

	@Override
	public void geraArquivo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Favorecido: "+this.favorecido);
		sb.append("Beneficiado: "+this.benefiado);
		sb.append("Valor: "+this.valor);
		this.geradorDeArquivo.gera(sb.toString());
	}
	
}
