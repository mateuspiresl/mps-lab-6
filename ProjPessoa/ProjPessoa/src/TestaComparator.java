import java.util.TreeSet;
import java.util.ArrayList;

public class TestaComparator {
	public static void main(String args[]){
		TreeSet<Pessoa> Nome = new TreeSet<Pessoa>();
		TreeSet<Pessoa> Data = new TreeSet<Pessoa>();
		 
		Pessoa pessoa1 = new Pessoa("111.222.333-44", "Gustavo", 20, 04, 1995), 
				pessoa2 = new Pessoa("444.555.666-77", "Mateus", 13, 11, 1989),
				pessoa3 = new Pessoa("777.888.999-10", "Ademir", 31, 02 , 1997),
				pessoa4 = new Pessoa("665.123.432-88", "Ademir", 11, 05, 1995);
	
		Nome.add(pessoa1);
		Nome.add(pessoa2);
		Nome.add(pessoa3);
		Nome.add(pessoa4);
		
		for(Pessoa pessoa : Nome){
			System.out.println(pessoa.getNome());
		}
		
		for(Pessoa pessoa : Nome){
			System.out.println(pessoa.getCPF());
		}
	
		ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
		pessoa.add(pessoa1);
		pessoa.add(pessoa2);
		pessoa.add(pessoa3);
		pessoa.add(pessoa4);
		
		algOrdenacao(pessoa); 
		for(Pessoa p : pessoa){
			System.out.println(p.getDataNascimento());
		}
		
	}
	
	
//===================================================================================
//				Algoritmo de ordenação
//==================================================================================
	public static void algOrdenacao(ArrayList<Pessoa> pessoas){
		int min, numPessoas = pessoas.size();
		Pessoa aux;
		
		for(int i = 0; i < numPessoas; i++){
			min = i;
			for(int j = i + 1; j < numPessoas; j++){
				Data data = pessoas.get(min).getDataNascimento();
				int res = pessoas.get(j).compareTo(data);
				if(res == -1){
					min = j;
				}
			}
			if(min != i){
				aux = pessoas.remove(min);
				pessoas.add(i, aux);
			}
		}
	}
}
