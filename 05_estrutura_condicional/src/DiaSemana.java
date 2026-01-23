
public class DiaSemana {

	public static void main(String[] args) {
		
		int numero = 7;
		String dia;
		switch (numero) {
		case 1: 
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + numero);
		}
		
		System.out.println(dia);

	}

}
