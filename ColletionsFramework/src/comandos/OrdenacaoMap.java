package comandos;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap implements Iterator<OrdenacaoMap> {

	public static void main(String[] args) {
		/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
		 * crie um dicionário e o ordene:
		 * 
		 * Autor: Hawking, Stephen - Livro: Uma breve história do tempo - Páginas: 256
		 * Autor: Duhigg, Charles - Livro: O poder do hábito - Páginas: 408
		 * Autor: Harari, Yuval Noah - Livro: Lições para o século - Páginas: 432*/
		
		System.out.println("Ordem aleatória:");
		Map<String, Livro> livros = new HashMap<>() {{
			put("Hawking, Stephen", new Livro(" Uma breve história do tempo", 256));
			put("Duhigg, Charles", new Livro(" O poder do hábito", 408));
			put("Harari, Yuval Noah", new Livro(" Lições para o século", 432));
		}
		};
		for (Entry<String, Livro> meusLivros : livros.entrySet()) {
			System.out.println(meusLivros.getKey()+" - "+meusLivros.getValue().getNome());
		}
		
		System.out.println("\nOrdem inserção:");
		Map<String, Livro> livros1 = new LinkedHashMap<>() {{
			put("Hawking, Stephen", new Livro(" Uma breve história do tempo", 256));
			put("Duhigg, Charles", new Livro(" O poder do hábito", 408));
			put("Harari, Yuval Noah", new Livro(" Lições para o século", 432));
		}
		};
		for (Entry<String, Livro> meusLivros : livros1.entrySet()) {
			System.out.println(meusLivros.getKey()+" - "+meusLivros.getValue().getNome());
		}
		
		System.out.println("\nOrdem alfabética autores:");
		Map<String, Livro> alfabetica = new TreeMap<>(livros);
		for (Entry<String, Livro> meusLivros : alfabetica.entrySet()) {
			System.out.println(meusLivros.getKey()+" - "+meusLivros.getValue().getNome());
		}
		
		System.out.println("\nOrdenação alfabética pelo nome do livro: ");
		Set<Map.Entry<String, Livro>> nome = new TreeSet<>(new ComparaNome());
		nome.addAll(alfabetica.entrySet());
		for (Entry<String, Livro> entry : nome) {
			System.out.println(entry);
		}
		
		System.out.println("\nOrdenação alfabética por número de páginas: ");
		/*Set<Map.Entry<String, Livro>> numeros = new TreeSet<>(new Comparator<Map.Entry<String, Livro>>() {

			@Override
			public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getValue().getPaginas(), o2.getValue().getPaginas());
			}
		});*/
		
		/*Set<Entry<String, Livro>> numeros = new TreeSet<>(Comparator.comparing(new Function<Entry<String, Livro>, Integer>() {

			@Override
			public Integer apply(Entry<String, Livro> t) {
				// TODO Auto-generated method stub
				return t.getValue().getPaginas();
			}
		}));*/
		
		Set<Entry<String, Livro>> numeros = new TreeSet<>(Comparator.comparing(para -> para.getValue().getPaginas()));
		numeros.addAll(alfabetica.entrySet());
		for (Entry<String, Livro> entry : numeros) {
			System.out.println(entry.getValue().getPaginas());
		}
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OrdenacaoMap next() {
		// TODO Auto-generated method stub
		return null;
	}

}

class ComparaNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
		// TODO Auto-generated method stub
		return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
	}
	
}

/*class ComparaPaginas implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
		// TODO Auto-generated method stub
		return livro1.getValue().getPaginas().compareTo(livro2.getValue().getPaginas());
	}
	
}*/

