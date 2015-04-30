package Composite;

public class CaminhoAndando implements Trecho {
	
	private String direcao;
	private double distancia;
	
	CaminhoAndando(String direcao, double distancia){
		this.direcao = direcao;
		this.distancia = distancia;
	}

	@Override
	public void imprime() {
		System.out.println("Ande para "+this.direcao);
		System.out.println("a distancia percorrida é de "+this.distancia+" metros");
	}

}
