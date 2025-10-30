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
}
