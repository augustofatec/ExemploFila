package WaitingQueue;

public class Funcionario {

	private String nome;
	private int cod;

	public Funcionario(String nome, int cod) {
		this.nome = nome;
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

}