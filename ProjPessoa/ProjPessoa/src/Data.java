
public class Data {
	
	private int dia, mes, ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia(){
		return this.dia;
	}
	
	public int getMes(){
		return this.mes;
	}
	
	public int getAno(){
		return this.ano;
	}
	
	public String toString(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}
