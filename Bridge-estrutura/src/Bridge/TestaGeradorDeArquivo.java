package Bridge;

public class TestaGeradorDeArquivo {

	public static void main(String[] args) {

		GeradorDeArquivoTXT geradorDeArquivoTXT = new GeradorDeArquivoTXT();
		Recibo recibo = new Recibo("Felipe do Nascimento", "Jo�o da Silva", 1500, geradorDeArquivoTXT);
		
		recibo.geraArquivo();
		
	}
}
