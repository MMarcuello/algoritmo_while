import java.util.Scanner;

public class algoritmo_while {


        public static void main(String[] args) {
            // write your code here
            Scanner s = new Scanner(System.in);
            int contador = 1;
            int resultado = 1;

            System.out.println("Indica el número para calcular el algoritmo");
            int valor = s.nextInt();

            while (contador <= valor) {
                resultado = resultado * contador;
                contador = contador + 1;
            }

            System.out.println("Este es su algoritmo: " + resultado);


        }
    }