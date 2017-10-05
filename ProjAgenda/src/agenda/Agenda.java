package agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Agenda {
	
	private Map<String, Pessoa> contatos;
		
	public Agenda() {
		this.contatos = new HashMap<>();
	}
	
	public Pessoa buscaPessoa(String name) {
		return contatos.get(name);
	}
		
	public void inserePessoa(Pessoa pessoa) {
		this.contatos.put(pessoa.getNome(), pessoa);
	}
	
	public List<String> listarNomes() {	
		return new ArrayList<String>(contatos.keySet());
	}
		
	public List<Pessoa> listarPessoas() {
		return new ArrayList<Pessoa>(contatos.values());
	}
	
}
