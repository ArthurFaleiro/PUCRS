/**
 *Faça um programa que informe o número de alunos de uma turma e
calcule a média do exercício de avaliação 1 dos alunos
 * 
 * @author (Arthur) 
 * @version (1)
 */
import java.util.Scanner;
public class Exercicio1For{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num_alunos, i;
        double notaE1, soma_notas=0, media_notas;
        
        System.out.println("INFORME QUANTOS ALUNOS TEM NA TURMA");
        num_alunos = scanner.nextInt();
        
        for (i=0; i< num_alunos; i++){
            System.out.println("INFORME A NOTA DO E1");
            notaE1 = scanner.nextDouble();
            
            soma_notas = soma_notas + notaE1;
        }
        media_notas = soma_notas / num_alunos;
        System.out.println("MEDIA DAS NOTAS "+ media_notas);
        
    }
}