package NumeroAleatorio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public void adivinacionNumero ()
        {
            /*
                1. Crea un programa de adivinación de números El programa genera de manera
                aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
                máximo de 7 intentos. Después de cada intento, indica si el número es mayor
                o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
                de intentos utilizado; si no, mostrar un aviso de que debe introducir
                nuevamente un número
            */

            Scanner teclado = new Scanner(System.in);

            int numteclado;
            int intentos = 1;
            Random aleatorio = new Random(); // igual a int aleatorio = (int) (Math.random()*50+1;)
            int numAleatorio = aleatorio.nextInt(50);

            System.out.println("-----------------------------------");
            System.out.println("Tienes 7 intentos para adivinar el número entre el 1 al 50");

            do
            {
                System.out.printf("%dº Intento (Restante -> %d)\n", intentos, (8-intentos));

                numteclado = teclado.nextInt();
                if (numAleatorio == numteclado)
                {
                    System.out.println("¡FELICIDADES! Has hacertado");
                    break;

                }else if (numAleatorio > numteclado)
                {
                    System.out.println("Te has quedado por debajo del Número");
                }else
                {
                    System.out.println("Has Sobrepasado el Número");
                }

                intentos++;

            }while(intentos < 8);

            if(intentos == 8)
            {
                intentos--;
            }

            System.out.printf("En Total de intentos -> %d\n", intentos);
            System.out.println("El Número Oculto es el -> " + numAleatorio);
            System.out.println("\nSaliendo ..................");
        }
}
