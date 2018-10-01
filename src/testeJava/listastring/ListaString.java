package testeJava.listastring;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class ListaString {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Pedro");
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("JOAO");
		nomes.add("Alberto");
		nomes.add("João");
		nomes.add("MARIA");

		System.out.println(teste(nomes));

	}

	public static int frequencia(Collection<?> c, Object o, Collator coll) {
		int result = 0;
		if (o == null) {
			for (Object e : c)
				if (e == null)
					result++;
		} else {
			for (Object e : c)
				if (coll.compare(o, e) == 0)
					result++;
		}
		return result;
	}

	public static Map<String, Integer> teste(List<String> lista) {
		final Collator coll = Collator.getInstance(new Locale("pt", "BR"));
		coll.setStrength(Collator.PRIMARY);
		Map<String, Integer> retorno = new TreeMap<String, Integer>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return coll.compare(o1, o2);
			}
		});
		for (String nome : lista) {
			int total = frequencia(lista, nome, coll);
			retorno.put(nome.toUpperCase(), total);
		}
		return retorno;
	}

}
