import java.util.Scanner;

public class SentenciaSwitch {

    public void usoSwitchInt()
    {
        int valor = 3;
        String nombre; // Se tiene que poner fuera ya que si inicializas en cada caso da error ya que solo se puede hacer una vez x llaves
                        // En caso de que no haya algun caso como el default daría error y tendria que inicializarla a null (nombre = null)
        switch(valor)
        {
            case 1:
                System.out.println("Valor 1");
                nombre = "María";
                break;

            case 5:
                System.out.println("Valor 5");
                nombre ="Juán";
                break;

            case 7:
                System.out.println("Valor 7");
                nombre = "Borja";
                break;

            default:
                System.out.println("Valor no Encontrado");
                nombre ="ningún Nombre.";
                break;
        }

        System.out.println("Finalizado el Bloque Switch");
        System.out.println("El nombre Resultante es " + nombre);
    }

    public void usoSwitchString()
    {
        String nombre = "Borja";
       // nombre = nombre.toLowerCase();

        switch (nombre.toLowerCase())
        {
            case "borja":
                System.out.println("El nombre es Borja");
                break;

            case "lucía":
                System.out.println("El nombre es Lucía");
                break;

            case "juán":
                System.out.println("El nombre es Juán");
                break;

            default:
                System.out.println("Nombre no encontrado");
                break;
        }

        System.out.println("Fin del Bloque switchString");
    }

    public void usoSwitchChar()
    {
        char letra = 'a';

        switch (letra)
        {
            case 'a':
                System.out.println('a');
                break;

            case 'b':
                System.out.println('b');
                break;

            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println('B');
                break;

            default:
                System.out.println("Letra no encontrada");
                break;
        }

        System.out.println("Fin del bloque switchChar");
    }

    public void usoSwitchLamda()
    {
        int nota = 7;

        switch (nota)
        {
            case 1 -> {
                System.out.println("Seleccionado caso 1");
            }

            case 2 -> {
                System.out.println("Seleccionado el caso 2");
            }

            case 3 -> {
                System.out.println("Seleccionado el caso 3");
            }

            case 4,5,6,7,8 -> {
                System.out.println("Esta dentro");
            }

            default -> {
                System.out.println("Sin Contemplar");
            }
        }

        System.out.println("Fin del bloque switchLamda");
    }

    public void menu()
        {
            Scanner escaner = new Scanner(System.in);

            System.out.println("----- Menú -----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multi");
            System.out.println("4. Dividir");
            System.out.println("5. Módulo");
            System.out.println("6. Salir");
            System.out.println("Opción escogida -> ");

            int opcionMenu = escaner.nextInt();
            System.out.println("\nIntroduce el Operando 1 ->");
            int operando1 = escaner.nextInt();
            System.out.println("\nIntroduce el Operando 2 ->");
            int operando2 = escaner.nextInt();
            double resultado = 0;

            switch (opcionMenu)
            {
                case 1 -> {
                    System.out.println("Suma");
                    resultado = operando1 + operando2;
                }

                case 2 -> {
                    System.out.println("Resta");
                    resultado = operando1 - operando2;
                }

                case 3 -> {
                    System.out.println("Multi");
                    resultado = operando1 * operando2;
                }

                case 4 -> {
                    System.out.printf("Dividir");
                    resultado = (double) operando1 / operando2;
                }

                case 5 -> {
                    System.out.println("Módulo");
                    resultado = operando1 % operando2;
                }
                case 6 -> {

                }

                default -> {
                    System.out.println("Opción NO Válida");
                }
            }

            System.out.printf("\nEl Resultado es -> %.1f%n", resultado);
            System.out.println("Saliendo del Programa");
        }
}
