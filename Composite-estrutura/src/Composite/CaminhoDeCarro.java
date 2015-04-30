package Composite;

public class CaminhoDeCarro implements Trecho {

	private String direcao;
	private double distancia;
	
	CaminhoDeCarro(String direcao, double distancia){
		this.direcao = direcao;
		this.distancia = distancia;
	}
	
	@Override
	public void imprime() {
		System.out.println("Dirija para "+this.direcao);
		System.out.println("a distancia percorrida é de "+this.distancia+" metros");	
	}

}
