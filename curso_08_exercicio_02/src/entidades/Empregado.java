package entidades;

public class Empregado {
	private String nome;
	private double salarioBruto;
	private double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void aumentarSalario(int porcentagem) {

		salarioBruto += salarioBruto * ((double) porcentagem / 100);
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	@Override
	public String toString() {
		return String.format("%s, R$ %.2f", nome, this.salarioLiquido());
	}

}
