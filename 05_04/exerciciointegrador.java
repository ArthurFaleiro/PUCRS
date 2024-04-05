
/**
 * Escreva um programa que leia data de aniversário de uma pessoa no formato dd mm aaaa.Depois
leia o dia em que a pessoa está usando o programa, com a data no mesmo formato.


 * Escreva uma descrição da classe ExercicioIntegrador aqui.
 * 
 * @author (Arthur e Piedro) 
 * @version (1)
 */
import java.util.Scanner;
public class ExercicioIntegrador
{
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("\f Digite dia em que você nasceu no formato dd:");
        int dia, mes, ano, diaAniversario, mesAniversario, anoAniversario;
        diaAniversario = teclado.nextInt();
        
        if (diaAniversario <1 || diaAniversario >31) {
            System.out.println("\n Dia inválido");   
        }
        else {
            System.out.println("\n Digite o mês em que você nasceu no formato mm:");
            mesAniversario = teclado.nextInt();
            if (mesAniversario <1 || mesAniversario >12){
                System.out.println("\n Mês inválido");
            }
            else{
                System.out.println("\n Digite o ano em que você nasceu no formato aaaa:");
                anoAniversario = teclado.nextInt();
            if (anoAniversario <0 || anoAniversario > 9999){
                System.out.println("\n Ano  inválido");
          
            }
            else {
                System.out.println("\n Digite o dia atual no formato dd:");
                dia = teclado.nextInt();
                if (dia <1 || dia >31) {
                    System.out.println("\n Dia inválido");   
                } else {
                    System.out.println("\n Digite o mês atual no formato mm:");
                    mes = teclado.nextInt();
                    if (mes <1 || mes >12){
                        System.out.println("\n Mês inválido");
                    }
                    else {
                        System.out.println("\n Digite o ano atual no formato aaaa:");
                        ano = teclado.nextInt();
                        if (ano <0 || ano > 9999){
                            System.out.println("\n Ano  inválido");
                  
                        }
                        else {
                            switch(mesAniversario){
                                case 1:
                                    if (diaAniversario >=21){
                                        System.out.println("\n Você é de Aquário!");   
                                    }
                                    else {
                                        System.out.println("\n Você é de Captricórnio!");
                                    }
                                    break;
                                case 2: 
                                    if (diaAniversario >=18){
                                        System.out.println("\n Você é de Aquário!");   
                                    }
                                    else{
                                        System.out.println("\n Você é de Peixes!");
                                    } 
                                    break;
                                case 3:
                                    if (diaAniversario >= 21){
                                        System.out.println("\n Você é de Áries!");   
                                    }
                                    else{
                                        System.out.println("\n Você é de Peixes!");
                                    } 
                                    break;
                                case 4:
                                    if (diaAniversario >= 21){
                                        System.out.println("\n Você é de Touro!");   
                                    }
                                    else{
                                        System.out.println("\n Você é de Áries!");
                                    } 
                                    break;
                                case 5:
                                    if (diaAniversario >= 21){
                                        System.out.println("\n Você é de Gêmeos!");   
                                    }
                                    else {
                                        System.out.println("\n Você é de Touro!");
                                    }
                                    break;
                                case 6:
                                    if (diaAniversario >=21){
                                        System.out.println("\n Você é de Câncer!");   
                                    }
                                    else {
                                        System.out.println("\n Você é de Gêmeos!");
                                    }
                                    break;
                                case 7:
                                    if (diaAniversario >= 23){
                                        System.out.println("\n Você é de Leão!");   
                                    }
                                    else {
                                        System.out.println("\n Você é de Câncer!");
                                    }
                                    break;
                                case 8:
                                    if (diaAniversario >= 23){
                                        System.out.println("\n Você é de Virgem!");   
                                    }
                                    else {
                                        System.out.println("\n Você é de Leão!");
                                    }
                                    break;
                                case 9:
                                    if (diaAniversario >= 23){
                                        System.out.println("\n Você é de Libra!");   
                                    }
                                    else {
                                        System.out.println("\n Você é de Virgem!");
                                    }
                                    break;
                                case 10:
                                    if (diaAniversario >= 23){
                                        System.out.println("\n Você é de Escorpião!");   
                                    }
                                    else {
                                        System.out.println("\n Você é de Libra!");
                                    }
                                    break;
                                case 11:
                                    if (diaAniversario >= 22){
                                        System.out.println("\n Você é de Sagitário!");   
                                    }
                                    else {
                                        System.out.println("\n Você é de Escorpião!");
                                    }
                                    break;
                                case 12:
                                    if (diaAniversario >= 22){
                                        System.out.println("\n Você é de Capricórnio!");   
                                    }
                                    else {
                                        System.out.println("\n Você é de Sagitário!");
                                    }
                                    break;
                            }
                        }
                    }
                }
                
            }
                
                
            }
        }
        
        
        
    }
    
}
