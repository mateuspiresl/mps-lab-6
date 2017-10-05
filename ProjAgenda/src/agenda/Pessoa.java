package agenda;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String endereço;
	
	public Pessoa() {
		this.nome = "Nome e Sobrenome";
		this.telefone = "7777-7777";
		this.endereço = "Logradouro Lorum";
	}
	
	public Pessoa(String nome, String telefone, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereço() {
		return endereço;
	}
	
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.telefone + " " + this.endereço;
	}
	
}
