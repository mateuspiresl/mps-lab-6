import java.util.Comparator;

public class ComparadorNome implements Comparator<Object>{
	
	@Override
	public int compare(Object arg0, Object arg1) {
		Pessoa pessoa1 = (Pessoa) arg0;
		Pessoa pessoa2 = (Pessoa) arg1;	
		String nomePessoa1 = pessoa1.getNome();
		String nomePessoa2 = pessoa2.getNome();
		
		if(nomePessoa1.equals(nomePessoa2)){ 
			String cpfPessoa1 = pessoa1.getCPF();
			String cpfPessoa2 = pessoa2.getCPF();
			
			return cpfPessoa1.compareTo(cpfPessoa2);
		}else{
			return nomePessoa1.compareTo(nomePessoa2);
		}
	}
}
