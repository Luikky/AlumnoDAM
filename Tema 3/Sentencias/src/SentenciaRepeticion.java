import java.util.Scanner;

public class SentenciaRepeticion {

    public void sentenciaFor()
    {
        for(int i= 0; i<5; i++)
        {
            System.out.println(i);
        }
    }

    public void sentenciaMultiplicar()
    {
        Scanner scanner = new Scanner(System.in);
        int resultado;
        System.out.println("Escoge la Tabla de Multiplicar");
        int teclado = scanner.nextInt();
        System.out.println();

        for(int i=0; i<=10; i++)
        {
            resultado = teclado * i;
            System.out.printf("%d * %d = %d%n",teclado, i, resultado);
        }

    }

    public void sentenciaWhile()
    {
        int numero;
        int aleatorio = (int) (Math.random() * 11); // Math.random() -> Genera un número aleatorio entre 0 y 0,99 (El rango que quieres porle es el * +1 un numero del que quieres que llegue *11 llega de 0 - 10,99)
        int intentos = 1;

        System.out.println("El Número Generado es el " + aleatorio);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nIntroduce un Número para ver si es el correcto -> \n %dº Intento", intentos);
        numero = scanner.nextInt();

        while(aleatorio != numero)
        {
            intentos ++;
            System.out.printf("El Número Introducido es Diferente,\n %dº Intento", intentos);
            System.out.println("\nIntroduce un nuevo número -> ");
            numero = scanner.nextInt();
        }

        if(numero == aleatorio)
        {
            System.out.println("Enorabuena has acertado en el intento ." + intentos);
        }else
        {
            System.out.println("Lo siento no has acertado.");
        }

        System.out.println("La Evaluación a Terminado.");
    }

    public void imprimirMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do
        {
            System.out.println("--- Menú ---");
            System.out.println("1. Leer Archivos.");
            System.out.println("2. Modificar Archivos.");
            System.out.println("3. Guardar Archivos.");
            System.out.println("4. Salir");
            System.out.println("\n Intoduzca la Opción que Desea -> ");
            opcion = scanner.nextInt();

            switch (opcion)
            {
                case 1 :
                    System.out.println("Opción 1");
                    //
                    break;

                case 2:
                    System.out.println("Opción 2");
                    //
                    break;

                case 3 :
                    System.out.println("Opción 3");
                    //
                    break;

                default:
                    System.out.println("Opción no contemplada");
                    break;

                case 4:
                    System.out.println("Saliendo del Programa...");
            }
        }while(opcion !=4);
    }
}