package comandos;

import java.util.Iterator;

public class Mes implements Iterable<Mes>{

	private String nome;
	private Double mediaTemperatura;
	
	public Mes(String nome, Double mediaTemperatura) {
		super();
		this.nome = nome;
		this.mediaTemperatura = mediaTemperatura;
	}

	public String getMes() {
		return nome;
	}

	public void setMes(String nome) {
		this.nome = nome;
	}

	public Double getMediaTemperatura() {
		return mediaTemperatura;
	}

	public void setMediaTemperatura(Double mediaTemperatura) {
		this.mediaTemperatura = mediaTemperatura;
	}

	@Override
	public String toString() {
		return "Meses [nome=" + nome + ", mediaTemperatura=" + mediaTemperatura + "]";
	}

	@Override
	public Iterator<Mes> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
