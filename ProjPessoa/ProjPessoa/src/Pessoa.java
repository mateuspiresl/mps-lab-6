import java.lang.Comparable;

public class Pessoa implements Comparable{
	
	private String cpf, nome;
	private Data data_nascimento;
	
	public Pessoa(String cpf, String nome, int dia, int mes, int ano){
		this.cpf = cpf;
		this.nome = nome;
		this.data_nascimento = new Data(dia, mes, ano);
	}
	
	public String getCPF(){
		return this.cpf;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public Data getDataNascimento(){
		return this.data_nascimento;
	}
	
	
	@Override
	public int compareTo(Object o) {
		Pessoa pessoa2 = (Pessoa) o;
		return compareTo(pessoa2);
	}
	
	public int compareTo(Pessoa pessoa2){
		ComparadorNome comparador = new ComparadorNome();
		return comparador.compare(this, pessoa2);
	}
	
	public int compareTo(Data data){
		ComparadorData comparador = new ComparadorData();
		return comparador.compare(this.data_nascimento, data);
	}
	
}
