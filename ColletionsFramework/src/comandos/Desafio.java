package comandos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Desafio implements Comparator<Numero>{

	public static void main(String[] args) {
		Random random = new Random();		
		List<Numero> numeros = new ArrayList<>();
		List<Numero> numeros1 = new ArrayList<>();
		int numero = 0, iguais = 0;
		while(numeros.size()<100) {
			numero = random.nextInt(100);
			numeros.add(new Numero(numero));

		}
		System.out.println(numeros);
		System.out.println();

		for (Numero numero1 : numeros) {

			System.out.println(numero1);
		}
		
				
	}

	@Override
	public int compare(Numero o1, Numero o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getAleatorio(), o2.getAleatorio());
	}

}

class Numero implements Comparable<Numero>{
	private int aleatorio;

	public Numero(int aleatorio) {
		super();
		this.aleatorio = aleatorio;
	}

	public int getAleatorio() {
		return aleatorio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aleatorio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numero other = (Numero) obj;
		return aleatorio == other.aleatorio;
	}

	@Override
	public String toString() {
		return "[aleatorio=" + aleatorio + "]";
	}

	@Override
	public int compareTo(Numero o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.getAleatorio(), o.getAleatorio());
	}
}

class Comparar implements Comparator<Numero>{

	@Override
	public int compare(Numero o1, Numero o2) {
		// TODO Auto-generated method stub
		return this.compare(new Numero (o1.getAleatorio()), new Numero(o2.getAleatorio()));
	}
	
}
