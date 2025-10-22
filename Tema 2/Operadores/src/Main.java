import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Iniciando Programa de Operadores");

        Operador operadores = new Operador();
        operadores.operadoresAritmeticos();
        operadores.operadoresAsignacion();
        operadores.operadoresComparacion();
        operadores.operadoresLogicos();
/*
        System.out.println("-------------------------------");
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Nombre y Apellido");
        String nombre = lectorTeclado.nextLine(); // nextLine te coge los espacios next solo la primera palabra
        System.out.println("¿Qué Salio quieres Ganar?");
        double salarioEntrada = lectorTeclado.nextDouble();
        System.out.println("¿Qué edad Tienes?");
        int edadEntrada = lectorTeclado.nextInt();
        System.out.println("¿Tienes Carnet de Conducir?");
        boolean conducirEntrada = lectorTeclado.nextBoolean();
        operadores.evaluarCandidato(salarioEntrada, edadEntrada, conducirEntrada, nombre);
*/
        System.out.println("---------------------------");
        operadores.cambioTipos();
    }
}
