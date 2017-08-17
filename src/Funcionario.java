
public class Funcionario extends Pessoa{
	private String Setor;
	private boolean Trabalhando;
	
	
	public void MudarTrabalho() {
		this.Trabalhando= !this.Trabalhando;
	}


	public String getSetor() {
		return Setor;
	}


	public void setSetor(String setor) {
		Setor = setor;
	}


	public boolean getTrabalhando() {
		return Trabalhando;
	}


	public void setTrabalhando(boolean trabalhando) {
		Trabalhando = trabalhando;
	}
	
	
}
