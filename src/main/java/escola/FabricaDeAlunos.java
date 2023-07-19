package escola;

public class FabricaDeAlunos {
	
	private Aluno aluno;
	
	public void comNomeCpfEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
	}
	
}
