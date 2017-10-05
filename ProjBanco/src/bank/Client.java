package bank;

public class Client
{
	public String name, cpf;
	
	public Client(String name, String cpf)
	{
		this.name = name;
		this.cpf = cpf;
	}
	
	public Client() {
		this("Nome e Sobrenome", "123.456.789-90");
	}

	public String getName() {
		return this.name;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return String.format("Cliente: %s, %s", this.name, this.cpf);
	}
}
