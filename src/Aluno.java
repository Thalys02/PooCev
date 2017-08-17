
public class Aluno extends Pessoa {

	private int Matr;
	private String Curso;
	
	public void CancelarMatr() {
		System.out.println("Matricula será cancelada");
	}

	public int getMatr() {
		return Matr;
	}

	public void setMatr(int matr) {
		Matr = matr;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}
	
	
}
