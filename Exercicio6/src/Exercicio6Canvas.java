import java.util.Scanner;

public class Exercicio6Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int AlunoQuanti, SalaQuanti;
		double AlunoPorcentagem, MediaF = 0, count = 0;
		
		System.out.print("Informe o número de salas: ");
		SalaQuanti = teclado.nextInt();
		
		int [] sala = new int [SalaQuanti];
		
		for ( int i = 0; i < sala.length; i++) {
			
		System.out.print("Informe a número de alunos da sala " + (i + 1) + ": " );
		AlunoQuanti = teclado.nextInt();
		
	    double [] notas = new double [AlunoQuanti];
		
		for ( int x = 0; x < notas.length; x++) {
		
			System.out.print("Insira a nota do " + (x + 1) + " aluno: ");
		
			notas[x] = teclado.nextDouble();
		}
		for ( int x = 0; x < notas.length; x++) {
			
			MediaF = MediaF + notas[x];
		}
		
		MediaF = MediaF / AlunoQuanti;
		
		for ( int y = 0; y < notas.length; y++) {
			if(notas[y] > MediaF) {
				count++;
			}
		}
		 
		AlunoPorcentagem = count/AlunoQuanti;
		System.out.println("A porcentagem de aprovação é: " + String.format("%.3f", (AlunoPorcentagem * 100)) + "%");	
	    count = 0;
	    MediaF = 0;
		
		
		}
	}
}