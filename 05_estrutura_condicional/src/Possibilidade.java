
public class Possibilidade {
	public static void main(String[] args) {
		int hora = 20;
		
		if(hora < 12) {
			System.out.println("Bom dia!");
		}else if(12 <= hora && hora< 18) {
			System.out.println("Boa Tarde!");
		}else if(hora >=18) {
			System.out.println("Boa Noite!");
		}
		
	}

}
