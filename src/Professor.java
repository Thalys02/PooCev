
public class Professor extends Pessoa{

	private String Especialidade;
	private float Salario;
	
	public void ReceberAum(float aum) {
		this.Salario=this.Salario+aum;
	}

	public String getEspecialidade() {
		return Especialidade;
	}

	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}
	
	
}
