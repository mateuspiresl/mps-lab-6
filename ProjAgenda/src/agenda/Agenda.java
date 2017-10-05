package agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
		ArrayList<String> nomes = new ArrayList<String>(contatos.size());
		for (Entry<String, Pessoa> entry : contatos.entrySet()) {
			nomes.add(entry.getKey());
		}
		return nomes;
	}
		
	public List<Pessoa> listarPessoas() {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(contatos.size());
		for (Entry<String, Pessoa> entry : contatos.entrySet()) {
			pessoas.add(entry.getValue());
		}
		return pessoas;
	}
	
}
