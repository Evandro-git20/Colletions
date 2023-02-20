package comandos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.IntegerSyntax;

public class ExerciciosStreamApi {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("1","0","4","1","2","3","9","9","6","5"); 
		System.out.println("Imprima todos os elementos desta lista:");
		lista.forEach(System.out::println);
		
		System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set");
		lista.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
		
		System.out.println("\nTransforme esta lista de Strings para uma lista de números inteiros: ");
//		List<Integer> listaInteiros = lista.stream().map(Integer::parseInt).collect(Collectors.toList());
//		for (Integer integer : listaInteiros) {
//			System.out.println(integer);
//		}
		lista.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("\nColete os números pares e que são maiores do que 2 e coloque em uma lista e depois exiba:");
		lista.stream().map(Integer::parseInt).filter(pares -> pares%2 == 0 && pares>2).collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("\nMostre a média dos números: ");
		lista.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
		
		System.out.println("\nRemova os números ímpares:");
		List<Integer> impares = lista.stream().map(Integer::parseInt).collect(Collectors.toList());
		impares.removeIf(impar -> impar%2 != 0);
		for (Integer integer : impares) {
			System.out.println(integer);
		}
	}

}
