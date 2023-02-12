package comandos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListMes {

	public static void main(String[] args) {
		
		List<Mes> meses = new ArrayList<Mes>() {{
			add(new Mes("Janeiro", 30d));
			add(new Mes("Fevereiro", 38d));
			add(new Mes("Março", 34d));
			add(new Mes("Abril", 33d));
			add(new Mes("Maio", 28d));
			add(new Mes("Agosto", 24d));
		}
		};
		
		Double soma = 0.0, maior = 0.0, media = 0.0;		

	}
}
