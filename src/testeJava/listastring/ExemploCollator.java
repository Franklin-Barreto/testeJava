package testeJava.listastring;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

class ExemploCollator {
	public static void main(String[] args) {
		// Vamos comparar duas strings ignorando os acentos.
		String st1 = "Gisele da Conceição Zózima Bündchen";
		String st2 = "Gisele da Conceicao Zozima Bundchen";
		String st3 = "GISELE DA CONCEICAO ZÓZIMA BUNDCHEN";
		String st4 = "Gisele da Conceicao Zozimo Bundchen"; // note que esta
															// string é
															// diferente
		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		collator.setStrength(Collator.PRIMARY); // importante!
		if (collator.compare(st1, st2) == 0) {
			System.out.println("As duas Giseles são a mesma pessoa, só diferem pelos acentos");
		}
		if (collator.compare(st1, st3) == 0) {
			System.out
					.println("As duas Giseles são a mesma pessoa, só diferem pelos acentos e pela diferença de caixa");
		}
		if (collator.compare(st1, st4) != 0) {
			System.out.println("As duas Giseles não são a mesma pessoa");
		}
		// Agora vamos mostrar um exemplo de ordenação ignorando os acentos.
		List<String> nomes = new ArrayList<String>();
		nomes.add("Pedro");
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("JOAO");
		nomes.add("Alberto");
		nomes.add("João");
		nomes.add("MARIA");

		// Não usando "collator"
		SortedSet<String> s1 = new TreeSet<String>();
		for (String d : nomes) {
			s1.add(d);
		}
		// Deve imprimir [José Aparecido, João Simões, Jó Abedenego], que é
		// ao contrário das regras da língua portuguesa
		System.out.println(s1);
		// Usando "collator", segue as regras:
		// imprime "[Jó Abedenego, João Simões, José Aparecido]"
		final Collator coll = Collator.getInstance(new Locale("pt", "BR"));
		SortedSet<String> s2 = new TreeSet<String>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return coll.compare(o1, o2);
			}
		});
		for (String d : nomes) {
			s2.add(d);
			System.out.println(s2.comparator());
		}
	}

	public static Map<String, Integer> ordernarIgnorando(List<String> nomes) {

		return null;
	}
}