package agenda;

public class UsaAgenda {
	
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.inserePessoa(new Pessoa("Zé Primeiro", "1111-1111", "Casa de palha"));
		agenda.inserePessoa(new Pessoa("Zé Segundo", "2222-2222", "Casa de madeira"));
		agenda.inserePessoa(new Pessoa("Zé Terceiro", "3333-3333", "Casa de tijolo"));
		agenda.inserePessoa(new Pessoa("Zé Quarto", "4444-4444", "Iglu"));
		agenda.inserePessoa(new Pessoa("Zé Quinto", "5555-5555", "Oca"));
		
		for (String nome : agenda.listarNomes()) {
			System.out.println(nome);
		}
		
		for (Pessoa pessoa : agenda.listarPessoas()) {
			System.out.println(pessoa);
		}
			
		System.out.println(agenda.buscaPessoa("Zé Primeiro"));
		
	}
	
}
