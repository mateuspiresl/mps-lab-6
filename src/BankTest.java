import java.util.List;

import bank.Account;
import bank.Bank;
import bank.Client;

public class BankTest
{
	public static void main(String[] args)
	{
		Bank bank = new Bank();
		
		Account a1 = new Account("1", 1);
		Account a2 = new Account("2", 2);
		Account a3 = new Account("3", 3);
		Account a4 = new Account("4", 4);
		Account a5 = new Account("5", 5);
		
		Client cA = new Client("A", "a");
		Client cB = new Client("B", "b");
		Client cC = new Client("C", "c");
		
		bank.insert(a1, cA);
		bank.insert(a2, cB);
		bank.insert(a3, cB);
		bank.insert(a4, cC);
		bank.insert(a5, cC);
		
		print("Contas:");
		print("\tNúmero 1: %s", bank.findAccount("1"));
		print("\tNúmero 2: %s", bank.findAccount("2"));
		print("\tNúmero 3: %s", bank.findAccount("3"));
		print("\tNúmero 4: %s", bank.findAccount("4"));
		print("\tNúmero 5: %s", bank.findAccount("5"));
		print("\tNúmero 6: %s", bank.findAccount("6"));
		
		print("\nClientes:");
		print("\tCPF a: %s", bank.findClient("a"));
		print("\tCPF b: %s", bank.findClient("b"));
		print("\tCPF c: %s", bank.findClient("c"));
		print("\tCPF d: %s", bank.findClient("d"));
		
		print("\nContas por cliente:");
		print("\tCPF a:");
		printAccounts(bank.findAccountsByCpf("a"));
		print("\tCPF b:");
		printAccounts(bank.findAccountsByCpf("b"));
		print("\tCPF c:");
		printAccounts(bank.findAccountsByCpf("c"));
		print("\tCPF d:");
		printAccounts(bank.findAccountsByCpf("d"));
	}
	
	private static void print(String format, Object... args) {
		System.out.println(String.format(format, args));
	}
	
	private static void printAccounts(List<Account> list)
	{
		if (list.isEmpty())
			print("\t\t- Vazio -");
		else
			list.forEach(item -> print("\t\t%s", item));
	}
}
