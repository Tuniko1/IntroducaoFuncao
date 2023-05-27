package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//funções void não retornam nada além do seu conteúdo interno --> mensagem/mensagem2
		//funções com retorno devem ser impressas com sout --> mensagem3
		//funções com parâmetros definidos devem ser impressas com sout --> mensagem4/mensagem5

		mensagem();
		mensagem2(20);
		System.out.println(mensagem3());
		System.out.println (mensagem4(25));
		System.out.println (mensagem5(2,5));
	}
	static void mensagem() {
		System.out.println("Primeiro void");
	}

	static void mensagem2(double n) {
		System.out.println("O número informado foi: "+n);
		
	}
	static String mensagem3() {
		return "Aqui é minha função de numero 3";
	}
	static String mensagem4(int x) {
		return "Número informado é "+x;
	}
	static String mensagem5(int x, int y) {
		return "Soma dos dois números é "+(x+y);
	}
}
