package java_basico03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		int idade = ler.nextInt();
		
		if(idade > 20) {
			System.out.println("Idade maior que 20.");
		}else if(idade <17 && idade > 12){
			System.out.println("Idade menor que 17 e idade maior que 12");
		}else if(idade == 7 || idade < 5) {
			System.out.println("Idade igual a 7 ou idade menor que 5");
		}else {
			System.out.println("Outras combinações");
		}
	}

}
