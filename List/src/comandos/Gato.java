package comandos;

import java.util.Comparator;

public class Gato implements Comparable<Gato>{
	
	private String nome;
	private String cor;
	private Integer idade;
	
	public Gato(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		
		return this.getNome().compareToIgnoreCase(gato.getNome()); //Compara nomes.
	}
		
}

class ComparaIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato gato1, Gato gato2) {
		
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
	
}

class NomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato gato1, Gato gato2) {
		int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
		if(nome != 0) return nome;
		
		int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
		if(cor != 0) return cor;
		
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
	
}