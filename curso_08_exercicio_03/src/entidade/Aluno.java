package entidade;

public class Aluno {
	private String nome;
	private int n1;
	private int n2;
	private int n3;

	public double getMedia() {
		return (n1 + n2 + n3);
	}

	public String situacaoFinal() {
		return ((this.getMedia() >= 60) ? "Aprovado"
				: "Reprovado\n Faltando" + String.format("%f", 60 - this.getMedia()));
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" + this.situacaoFinal() + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}
}
