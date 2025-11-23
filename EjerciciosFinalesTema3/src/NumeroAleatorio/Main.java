package NumeroAleatorio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 =new Ejercicio2();
        int opcion;

        do
        {
            System.out.println("--- Menú de Ejercicios ---\n");
            System.out.println("1. Adivinación de Número Aleatorio.");
            System.out.println("2.Adivina la Letra Oculta.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5. Salir");

            opcion = escaner.nextInt();

            switch (opcion)
            {
                case 1:
                    ejercicio1.adivinacionNumero();
                    break;
                case 2:
                    ejercicio2.ejercicio2();
                    break;
            }
        }while(opcion == 5);

    }
}
