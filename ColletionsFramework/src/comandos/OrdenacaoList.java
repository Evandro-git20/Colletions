package comandos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Dados as seguintes informações sobre meus gatos,
 *crie uma lista e ordena esta lista exibindo: (nome, cor e idade).
 *Gato 1: = nome: Jon, cor: preto, idade: 18
 *Gato 2: = nome: simba, cor: tigrado, idade: 6
 *Gato 3: = nome: jon, cor: amarelo, idade: 12*/

public class OrdenacaoList {

	public static void main(String[] args) {
		
		List<Gato> gatos = new ArrayList<>() {{
			
			add(new Gato("Jon", "preto", 18));
			add(new Gato("Simba", "tigrado", 6));
			add(new Gato("Jon", "amarelo", 12));
		}
		};
		
		System.out.println("Ordem de inserção:"); //Por padrão, List ordena por ordem de inserção automaticamente.
		System.out.println(gatos);
		
		System.out.println("\nOrdem aleatória:");
		Collections.shuffle(gatos);
		System.out.println(gatos);
		
		System.out.println("\nOrdem natural (nome):");
		Collections.sort(gatos); //Ordena gatos por nome
		System.out.println(gatos);
		
		System.out.println("\nOrdem natural (cor):");
		Collections.sort(gatos); //Ordena gatos por nome
		System.out.println(gatos);
		
		System.out.println("\nOrdem natural (idade):");
		gatos.sort(new ComparaIdade()); //Ordena por idade
		System.out.println(gatos);
		
		System.out.println("\nOrdene por nome/cor/idade");
		gatos.sort(new NomeCorIdade());
		System.out.println(gatos);
		
	}

}
