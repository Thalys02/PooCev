
public class TestePessoa {
	public static void main(String[]args) {
		Pessoa 		p1 = new Pessoa();
		Aluno 		p2 = new Aluno();
		Professor 	p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Thalys");
		p3.setNome("Fabiana");
		p4.setNome("Bruna");
		
		p1.setSexo("M");
		p4.setSexo("F");
		
		p2.setIdade(18);
		p2.setCurso("Informatica");
		p3.setSalario(2500.00f);
		p4.setSetor("Callcenter");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}
}
