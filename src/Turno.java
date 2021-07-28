
public class Turno {
	
	public static void main(String[] args) {
		
		String nome = "Thiago";
		int matricula = 246;
		int turno1 = 001;
		int turno2 = 002;
		int turno3 = 003;
		int hora = 7;
		int min = 15;
		
		System.out.println("horario de entrada: "+ hora+":"+min);
		
		if (hora >= 6 && hora <=13) {
			System.out.println("Funcionário "+ nome + " matricula "+ turno1+"-"+matricula + " trabalha no turno: A");
		}else if (hora >=14 && hora <=21) {
			System.out.println("Funcionário "+ nome + " matricula "+ turno2+"-"+matricula + " trabalha no turno: B");
		}else if (hora >=22 || hora <=5) {
			System.out.println("Funcionário "+ nome + " matricula "+ turno3+"-"+matricula + " trabalha no turno: C");
		}
		
	}
	

}
