import java.util.Scanner;

public class ex6Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
		
		int AlunoQuanti, SalaQuanti;
		double AlunoPorcentagem = 0, MediaF = 0, count = 0;
		
		System.out.print("Informe o número de salas: ");
		SalaQuanti = teclado.nextInt();
		
		int [] sala = new int [SalaQuanti];
		
		for ( int i = 0; i < sala.length; i++) {
			
		System.out.print("Informe a número de alunos da sala " + (i + 1) + ": " );
		AlunoQuanti = teclado.nextInt();
		
	    double [] notas = new double [AlunoQuanti];
	    
		MediaF = nota(MediaF, notas, i);
		AlunoPorcentagem = porcentagem (notas, MediaF, count, AlunoPorcentagem);
		
		System.out.println("A sala " + (i + 1) + " teve uma porcentagem de aprovação de: " + String.format("%.3f", (AlunoPorcentagem * 100)) + "%");	
	    count = 0;
	    MediaF = 0;
		
		
		}
	}
	public static double nota( double MediaF, double notas[], int i) {
		
		Scanner teclado = new Scanner(System.in);
		
		for ( int x = 0; x < notas.length; x++) {
		
			System.out.print("Insira a nota do " + (x + 1) + " aluno: ");
		
			notas[x] = teclado.nextDouble();
		}
		for ( int x = 0; x < notas.length; x++) {
			
			MediaF = MediaF + notas[x];
		}
		
		MediaF = MediaF / notas.length; 
		return MediaF;
	}
	public static double porcentagem(double notas[], double MediaF, double count, double AlunoPorcentagem) {
		
		for ( int y = 0; y < notas.length; y++) {
			if(notas[y] > MediaF) {
				count++;
			}
		}
		 
		AlunoPorcentagem = count/notas.length;
		return AlunoPorcentagem;
	}
}
