import java.util.Scanner;

public class EjerciciosWhileDoWhile {

    /*Desarrolla un programa que pida al usuario una contraseña. La contraseña correcta es "1234".
    Usa un bucle do-while para seguir pidiendo la contraseña hasta que el usuario
    la introduzca correctamente.*/
    public void ejercicio2()
    {
        Scanner scanner = new Scanner(System.in);
        String password = "1234";
        String teclado = null;
        boolean correcto = false;

        do
        {
            System.out.println("Introduce la Contraseña -> ");
            teclado = scanner.next();

            correcto = teclado.equals(password);

            if(correcto == false)
            {
                System.out.println("Contraseña Inválida. Inténtalo de nuevo");
            }
            else
            {
                System.out.println("Contraseña Correcta");
            }

        }while(!correcto);
    }


    /*Escribe un programa que pida números al usuario y los vaya sumando.
    El bucle while debe continuar mientras el usuario introduzca números positivos.
    Cuando introduzca un número negativo o cero, el programa debe terminar y mostrar la suma total.*/
    public void ejercicio3()
    {
        Scanner numero = new Scanner(System.in);

        int num = 1;
        int resultado =0;

        while(num > 0)
        {
            System.out.println("Introduce un número (Negativo ó 0 Para Salir) -> ");
            num = numero.nextInt();

            if (num >0)
            {
                resultado += num;
                System.out.println("Suma Actual -> " + resultado);
            }
        }

        System.out.println("Saliendo del Programa. Suma Total -> " + resultado);
    }


    /*Crea un programa que pida al usuario cuántos estudiantes hay en una clase.
    Para cada estudiante, usa un bucle while para pedir su calificación numérica (0-10).
    Luego, usa un bucle for para mostrar todas las calificaciones y usa un switch para convertir
    cada nota numérica en letra: 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.*/

    public void ejercicio9()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de alumnos -> ");
        int numAlumnos = scanner.nextInt();
        System.out.println("");
        int nota [] = new int[numAlumnos];
        int cont =0;

        while(cont != numAlumnos)
        {
            System.out.printf("Introduce la Nota (0 - 10) del %dº Alumno -> ", cont+1);
            nota[cont] = scanner.nextInt();

            if (nota[cont] >=0 && nota [cont] <=10)
            {
                cont ++;
            }
            else
            {
                System.out.println("Valor NO Válido, Vuelva a Introducirlo");
            }
        }

        numAlumnos=0;
        System.out.println("\n--- REPORTE DE CALIFICACIONES ---");

        for(int item : nota)
        {
            numAlumnos ++;
            System.out.printf("La Nota del %dº Alumno es -> %d", numAlumnos, item);

            switch (item)
            {
                case 0,1,2:
                    System.out.print(" = Calificación F\n");
                    break;

                case 3,4:
                    System.out.print(" = Calificación D\n");
                    break;

                case 5,6:
                    System.out.print(" = Calificación C\n");
                    break;

                case 7,8:
                    System.out.print(" = Calificación B\n");
                    break;

                case 9,10:
                    System.out.print(" = Calificación A\n");
                    break;
            }
        }

    }
}
