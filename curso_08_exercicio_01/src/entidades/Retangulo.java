package entidades;

public class Retangulo {
	private double largura;
	private double altura;

	public double getArea() {
		return altura * largura;
	}

	public double getPerimetro() {
		return (largura * 2) + (altura * 2);
	}

	public double getDiagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}

	@Override
	public String toString() {
		return "AREA = " + this.getArea() + "\n" + "PERIMETRO = " + this.getPerimetro() + "\n" + "DIAGONAL = "
				+ this.getDiagonal() + "\n";
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
