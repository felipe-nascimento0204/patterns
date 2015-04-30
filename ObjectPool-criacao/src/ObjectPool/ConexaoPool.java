package ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class ConexaoPool implements Pool<Conexao>{
	
	private List<Conexao> conexoes = new ArrayList<Conexao>();
	
	ConexaoPool(){
		this.conexoes.add(new Conexao("usuario1"));
		this.conexoes.add(new Conexao("usuario2"));
		this.conexoes.add(new Conexao("usuario3"));
		this.conexoes.add(new Conexao("usuario4"));
		this.conexoes.add(new Conexao("usuario5"));
	}
	
	public Conexao acquire(){
		if(!this.conexoes.isEmpty()){
			return this.conexoes.remove(0);
		}
		return null;
	}
	
	public void release(Conexao con){
		this.conexoes.add(con);
	}
	
	public List<Conexao> getConexoes() {
		return conexoes;
	}

}
