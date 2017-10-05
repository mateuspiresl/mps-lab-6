package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank
{
	private Map<Account, Client> register;
	
	public Bank() {
		this.register = new HashMap<>();
	}
	
	public void insert(Account account, Client client) {
		this.register.put(account, client);
	}
	
	public Account findAccount(String number)
	{
		for (Account account : this.register.keySet())
			if (account.getNumber().equals(number))
				return account;
		
		return null;
	}
	
	public Client findClient(String cpf)
	{
		for (Client client : this.register.values())
			if (client.getCpf().equals(cpf))
				return client;
		
		return null;
	}
	
	public List<Account> findAccountsByCpf(String cpf)
	{
		List<Account> accounts = new ArrayList<>();
		
		for (Map.Entry<Account, Client> entry : this.register.entrySet())
			if (entry.getValue().getCpf().equals(cpf))
				accounts.add(entry.getKey());
		
		return accounts;
	}
}
