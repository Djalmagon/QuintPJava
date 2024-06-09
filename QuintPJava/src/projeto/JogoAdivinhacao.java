package projeto;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class JogoAdivinhacao {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			Random random = new Random();
			int numeroAleatorio = random.nextInt(100) + 1;
			int tentativas = 0;
			boolean acertou = false;
			
			System.out.println("Bem-vindo ao jogo de Adivinhação");
			System.out.println("Tente adivinha o número entre 1 e 100.");
			
			while (!acertou) {
				try {
					System.out.println("Digite o seu palpite: ");
					int palpite = scanner.nextInt();
					tentativas++;
					
					if (palpite < 1 || palpite > 100) {
						System.out.println("Por favor, digite entre 1 e 100.");
						continue;
					}
					
					if (palpite == numeroAleatorio) {
						acertou = true;
						System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
					}else if (palpite < numeroAleatorio) {
						System.out.println("O número é maior que " + palpite + ". Tente novamente.");
					}else {
						System.out.println("O número é menor que " + palpite + ". Tente novamente.");
					}
					
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número.");
				scanner.next();
				}
			}	
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}
