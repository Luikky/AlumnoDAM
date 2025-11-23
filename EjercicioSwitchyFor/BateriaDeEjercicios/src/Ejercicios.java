import java.util.Scanner;
import java.util.stream.Stream;

public class Ejercicios {

    /*Crea un programa que pida un número del 1 al 7 y use un switch
    para mostrar el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).
    */
    public void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        int diaSemana = 1;

        do
        {
            System.out.println("Preciona 0 para Salir");
            System.out.println("Introduce un nº del 1 al 7 para ver que día es -> ");
            diaSemana = scanner.nextInt();

            switch (diaSemana)
            {
                case 1:
                    System.out.println("Lunes\n");
                    break;

                case 2:
                    System.out.println("Martes\n");
                    break;

                case 3:
                    System.out.println("Miércoles\n");
                    break;

                case 4:
                    System.out.println("Jueves\n");
                    break;

                case 5:
                    System.out.println("Viernes\n");
                    break;

                case 6:
                    System.out.println("Sábado\n");
                    break;

                case 7:
                    System.out.println("Domingo\n");
                    break;

                default:
                    System.out.println("Introduzca un valor válido\n");
                    break;
            }

        }while(diaSemana != 0);

    }


    /*
    * Desarrolla un programa que pida una letra de calificación (A, B, C, D, F) y use un
    * switch para mostrar el mensaje correspondiente:
    * A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
    * */
    public void ejercicio2()
    {
        Scanner scanner = new Scanner(System.in);
        char calificacion;

        do {
            System.out.println("Introduce 1 Calificación A, B, C, D, F - (0 Para Salir)-> ");
            calificacion = scanner.next().charAt(0);

            char nota = Character.toLowerCase(calificacion);

            switch (nota)
            {
                case 'a':
                    System.out.println("Excelente");
                    break;

                case 'b':
                    System.out.println("Muy Bien");
                    break;

                case 'c':
                    System.out.println("Bien");
                    break;

                case 'd':
                    System.out.println("Suficiente");
                    break;

                case 'f':
                    System.out.println("Insuficiente");
                    break;

                case '0':
                    System.out.println("Saliendo del Programa");
                    break;

                default:
                    System.out.println("Introduzca un valor Válido");
                    break;
            }

        }while (calificacion != '0');
    }

}
