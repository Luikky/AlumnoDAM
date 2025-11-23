package EjercicioPalabras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
    Pedir por consola una frase. Una vez introducida. Indicar:
        1. Cuantas oraciones tiene -> separadas por un .
        2. Cuantas letras tiene
        3. Cuantas palabras tiene
        4. Cuantas letras tiene (sin contar espacios ni símbolos de puntuación)
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la Frase que quieres Analizar.");
        String frase = scanner.nextLine();
        String oraciones = frase.replaceAll(",", "\\.");
        String [] numeroOraciones =  oraciones.split("\\."); // con .split partimos la frase y es un nuevo elemento para el array, es indicarle el "stop"

        System.out.printf("Tiene %d oraciones", numeroOraciones.length);

        System.out.println("\n\n--- Número de Letras que Tiene La frase ---");
        String frasePalabras = frase.replaceAll(" ", "").replaceAll("\\.", "").replaceAll(",", ""); // .replaceAll, le decimo que reemplaze una letra por otra que le indicamos

        System.out.println("La Frase ha quedado ->\n" + frasePalabras);
        System.out.printf("\nTiene %d letras", frasePalabras.length());

        System.out.println("\n\n--- Analizamos el Número de Palabras que Tiene La Frase");

        String palabras = frase.replaceAll("\\.", "").replaceAll(",", "");
        String [] numeroPalabras = palabras.split(" ");
        System.out.printf("\nLa frase tiene %d palabras",numeroPalabras.length);

        System.out.println("\n\n--- Palabras por frases ---");

        for (String item : numeroOraciones)
        {
            int contador = item.split(" ").length;
            System.out.println("El número de palabras en la Oración es " + contador);
        }
    }
}
