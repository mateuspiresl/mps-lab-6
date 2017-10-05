import java.util.Comparator;

public class ComparadorData implements Comparator{
	
	@Override
	public int compare(Object arg0, Object arg1) {
		Data dataPessoa1 = (Data) arg0;
		Data dataPessoa2 = (Data) arg1;
		
		int anoPessoa1 = dataPessoa1.getAno(), anoPessoa2 = dataPessoa2.getAno();
		
		if(anoPessoa1 == anoPessoa2){
			int mesPessoa1 = dataPessoa1.getMes(), mesPessoa2 = dataPessoa2.getMes();
			
			if(mesPessoa1 == mesPessoa2){	
				int diaPessoa1 = dataPessoa1.getDia(), diaPessoa2 = dataPessoa2.getDia();
				
				if(diaPessoa1 == diaPessoa2)
					return 0;
				else if(diaPessoa1 < diaPessoa2)
					return -1;
				else
					return 1;
			}else{	
				if(mesPessoa1 < mesPessoa2)
					return -1;
				else
					return 1;
			}		
		}else{
			if(anoPessoa1 < anoPessoa2)
				return -1;
			else
				return 1;		
		}
	}
}
