import java.util.Scanner;

public class Exe03 {
          
         public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in); 
            
            int[] vetorA = new int[5]; 
            int[] vetorB = new int[vetorA.length];
                        
            for (int i=0; i<vetorA.length; i++); {
                System.out.println("Entre com a posição desejada: " + i);
                      
                    vetorA[i] = scan.nextInt();
                    vetorB[i] = vetorA[i];
            }

        }
    }