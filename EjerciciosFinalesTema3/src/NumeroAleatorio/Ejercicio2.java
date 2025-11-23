package NumeroAleatorio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2()
    {
        /*
            2. Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza las siguientes acciones:
                a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
                b. El programa debe seleccionar aleatoriamente una palabra del array y almacenarla como la palabra secreta.
                c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
                d. En cada intento, el usuario introduce una palabra por teclado.
                e. Tras cada intento, el programa debe indicar al usuario:
                i. Aciertos: cuántas letras tiene en la misma posición que la palabra secreta.
                ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una posición diferente.
                iii. Fallos: cuántas letras no están presentes en la palabra secreta.

            El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.
        */

        Scanner teclado = new Scanner(System.in);
        Random posrandom = new Random();
        String palabra = "Hola";
        palabra.toLowerCase();
        int intentos = 1;
        int posicionLetra = posrandom.nextInt(palabra.length());
        String letraOculta = String.valueOf(palabra.charAt(posicionLetra));
        String letra;

        System.out.println("Adivina la Letra Oculta de la Palabra -> " + palabra);
        System.out.println(letraOculta);

        for(int i=0; i < 5; i++)
        {
            letra = teclado.next();
            letra =letra.toLowerCase();

            if(letraOculta.equals(letra))
            {
                System.out.println("Felicidades Has Acertado la Letra Oculta");
                break;
            }

            System.out.println("Has Fallado");
        }

        System.out.println("Saliendo del Programa .............");
    }
}
