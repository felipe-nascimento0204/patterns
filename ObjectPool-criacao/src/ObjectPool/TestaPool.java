package ObjectPool;

public class TestaPool {

	public static void main(String[] args) {
		
		ConexaoPool conexaoPool = new ConexaoPool();
		Conexao conexao = conexaoPool.acquire();
		
		System.out.println("Conexoes disponiveis...");
		for(Conexao con : conexaoPool.getConexoes()){
			System.out.println(con.getUsuario());
		}
		
		conexaoPool.release(conexao);
		System.out.println("\nConexao "+ conexao.getUsuario() +" liberada...");
		for(Conexao con : conexaoPool.getConexoes()){
			System.out.println(con.getUsuario());
		}
		
	}
	
}
