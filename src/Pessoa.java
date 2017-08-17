
public class Pessoa {
	
	private String Nome;
	private int Idade;
	private String Sexo;
	
	//metodos publicos
	
	public void FazerAniversario() {
		this.Idade++;
	}
	//metodos especiais gets e sets
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", Idade=" + Idade + ", Sexo=" + Sexo + "]";
	}
	

}
