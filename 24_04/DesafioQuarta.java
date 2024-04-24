import java.util.Scanner;
public class DesafioQuarta{
     public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        String nome1, nome2, nome3;
        
        System.out.println("Digite o nome da primeira pessoa:");
        nome1= teclado.nextLine();
        System.out.println("Digite o nome da segunda pessoa:");
        nome2 = teclado.nextLine();
        System.out.println("Digite o nome da terceira pessoa:");
        nome3 = teclado.nextLine();
        
        String primeiro, segundo, terceiro;
        if(nome1.compareTo(nome2) < 0){
            if(nome1.compareTo(nome3) < 0){
                primeiro = nome1;
        if(nome2.compareTo(nome3) < 0){
                segundo = nome2;
                terceiro = nome3;
            }else{
                segundo = nome3;
                terceiro = nome2;
            }
            }else{
                primeiro = nome3;
                segundo = nome1;
                terceiro = nome2;     
            }
            }else{
        if(nome2.compareTo(nome3) < 0){
                    primeiro = nome2;
        if(nome1.compareTo(nome3) < 0){
                    segundo = nome1;
                    terceiro = nome3;
            }else{
                    segundo = nome3;
                    terceiro = nome1;
                }
            }else{
                    primeiro = nome3;
                    segundo = nome2;
                    terceiro = nome1;
                }
        }
        System.out.println("Nomes em ordem alfabética:");
        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);
        
            } 
        }