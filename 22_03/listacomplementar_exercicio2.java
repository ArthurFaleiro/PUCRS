import java.util.Scanner;
public class Semana
{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int valor;
        
        System.out.println("Informe o valor entre 1 e 7:");
        valor = teclado.nextInt();
        
        if (valor==1)
        System.out.println("Hoje é Domingo");
    
        if (valor==2)
        System.out.println("Hoje é Segunda-Feira");
        if (valor==3)
        System.out.println("Hoje é Terça-Feira");
        if (valor==4)
        System.out.println("Hoje é Quarta-Feira");
        if (valor==5)
        System.out.println("Hoje é Quinta-Feira");
        if (valor==6)
        System.out.println("Hoje é Sexta-Feira");
        if (valor==7)
        System.out.println("Hoje é Sábado");
    }
}