package Composite;

public class TestaTrecho {

	public static void main(String[] args) {
		
		Trecho trechoAndando = new CaminhoAndando("Av. Paulista", 1200);
		Trecho trechoDeCarro = new CaminhoDeCarro("Av. Rebouças", 5000);
		
		Caminho trechoCompleto = new Caminho();
		trechoCompleto.getTrechos().add(trechoAndando);
		trechoCompleto.getTrechos().add(trechoDeCarro);
		
		trechoCompleto.imprime();
		
	}
	
}
