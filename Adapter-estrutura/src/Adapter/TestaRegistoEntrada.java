package Adapter;

public class TestaRegistoEntrada {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setNome("Jo�o da Silva");
		f.setCodigo("123456");

		ControleDePontoAdapter controleDePontoAdapter = new ControleDePontoAdapter();
		controleDePontoAdapter.registraEntrada(f);
		
	}
	
}
