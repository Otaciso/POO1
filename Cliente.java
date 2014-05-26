
public abstract class Cliente {
	
	private String nome;
	private String cpf;
	private Agencia agencia;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Agencia getAgencia(){
		return agencia;
	}
}
