package testeJava.listastring;

import java.text.Collator;
import java.util.Locale;

public class Retorno {

	String nome;
	int quantidade;

	final Collator coll = Collator.getInstance(new Locale("pt", "BR"));


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		coll.setStrength(Collator.PRIMARY); 
		if (coll.compare(nome, ((Retorno) o).nome) != 0)
			return false;
		return true;
		// return nome.equals(((Retorno)o).nome);
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

}
