package principal;

import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {
		
		System.out.println(ganhador());

	}
	
	static String ganhador() {
		Random random = new Random();
		int op = random.nextInt(4);
		String[] nomes = {"Jose Luiz",
							"Arthur",
							"Fernando","Marcos"
		
		};
		return "o ganhador foi: "+nomes[op];
		
	}

}
