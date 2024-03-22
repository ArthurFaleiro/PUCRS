import java.util.Scanner;
public class Mês{
   public static void main(String args[]){
       Scanner teclado = new Scanner (System.in);
       
       int valor;
       
       System.out.println("Informe um valor entre 1 e 12:");
       valor = teclado.nextInt();
       
       if (valor==1)
       System.out.println("O mês é janeiro e tem 31 dias!");
       if (valor==2)
       System.out.println("O mês é fevereiro e tem 29 dias, é um ano bissexto!!!");
       if (valor==3)
       System.out.println("O mês é março e tem 31 dias!");
       if (valor==4)
       System.out.println("O mês é abril e tem 30 dias!");
       if (valor==5)
       System.out.println("O mês é maio e tem 31 dias!");
       if (valor==6)
       System.out.println("O mês é junho e tem 30 dias!");
       if (valor==7)
       System.out.println("O mês é julho e tem 31 dias!");
       if (valor==8)
       System.out.println("O mês é agosto e tem 31 dias!");
       if (valor==9)
       System.out.println("O mês é setembro, tem 30 dias e é meu aniversário nesse exato dia!");
       if (valor==10)
       System.out.println("O mês é outubro e tem 31 dias!");
       if (valor==11)
       System.out.println("O mês é novembro e tem 30 dias!");
       if (valor==12)
       System.out.print("O mês é dezembro e tem 31 dias e é natal!");
    }
}