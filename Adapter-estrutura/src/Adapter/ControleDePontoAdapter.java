package Adapter;

public class ControleDePontoAdapter extends ControleDePonto {

	private ControleDePontoNovo controleDePontoNovo = new ControleDePontoNovo();
	
	@Override
	public void registraEntrada(Funcionario f) {
		controleDePontoNovo.registraEntrada(f.getCodigo(), true);
	}
	
}
