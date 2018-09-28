package testeJava.complex;

public class ComplexNumber {

	private double a, b;

	public ComplexNumber() {
		// TODO Auto-generated constructor stub
		this.a = 0d;
		this.b = 0d;
	}

	public ComplexNumber(double x, double y) {
		this.a = x;
		this.b = y;
	}

	public void soma(ComplexNumber c) {

		this.a += c.a; 
		this.b += c.b;
	}

	public static ComplexNumber somaNumeros(ComplexNumber c, ComplexNumber c2) {
		ComplexNumber numero = new ComplexNumber(c.a, c.b);
		numero.soma(c2);
		return numero;
	}

	@Override
	public String toString() {

		return (int) this.a + " + " + (int) this.b + "i";
	}

}
