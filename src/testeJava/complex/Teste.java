package testeJava.complex;

public class Teste {

	public static void main(String[] args) {
		ComplexNumber number = new ComplexNumber(2, 3);
		number.soma(new ComplexNumber(5, 4));
		System.out.println(number);
		System.out.println(ComplexNumber.somaNumeros(new ComplexNumber(6, 5), new ComplexNumber(2, -1)));

	}
}
