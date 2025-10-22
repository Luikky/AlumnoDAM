import java.sql.SQLOutput;

public class Operador
{
    public void operadoresAritmeticos()
    {
        // Unarios
        int operador1 = 5;

        // incremento -> Sirve como contador
        operador1++;
        System.out.println("El valor del operador1 con incremento -> " + operador1);

        // decremento -> Intentos cuenta atrás
        operador1--;
        System.out.println("Elvalor del operador1 con decremento -> " + operador1);

        // Binarios -> dos operadores: suma (+) ; resta (-) ; multiplicación (*) ; división (/) ; módulo - resto devisión (%)
        operador1 = 8;
        int operador2 =3;
        int suma = operador1 + operador2;
        System.out.println(operador1 + "+" + operador2 + "=" + suma);

        int resta = operador1 - operador2;
        System.out.println(operador1 + "-" + operador2 + "=" + resta);

        int multiplicacion = operador1 * operador2;
        System.out.println(operador1 + "*" + operador2 + "=" + multiplicacion);

        double division = (double) operador1 / operador2; // Casting -> se pasa momentaneamente una variable a otra en este caso de int a double para solo esta operación.
        System.out.println(operador1 + "/" + operador2 + "=" + division);

        int resto = operador1 % operador2;
        System.out.println(operador1 + "%" + operador2 + "=" + resto);
    }

    public void operadoresAsignacion()
    {
        int operador1 = 10;
        int operador2 = 6;
        operador1 +=5; // es igual a operador1 = operador1 + 5
        System.out.println("\nEl Valor de Operador1 -> " + operador1);

        operador1 += operador2;
        System.out.println("El Valor de Operador1 -> " + operador1);

        operador1 -= 5;
        System.out.println("El Valor de Operador1 -> " + operador1);

        operador1 *= 2;
        System.out.println("El Valor de Operador1 -> " + operador1);

        operador1 %= 2;
        System.out.println("El Valor de Operador1 -> " + operador1);
    }

    public void operadoresComparacion ()
    {
        int op1 = 10;
        int op2 = 20;

        boolean resultado = op1 > op2;
        System.out.println("\nEl resultado de la Operación es -> " + resultado);

        resultado = op1 < op2;
        System.out.println("El resultado de la Operación es -> " + resultado);

        resultado = op1 != op2;
        System.out.println("El resultado de la Operación es -> " + resultado);
    }

    public void operadoresLogicos()
    {
        // ¿Cuánto quieres cobrar?
        // ¿Cuántos años tienes?
        // ¿Tienes Carnet?

        int sueldo = 20000;
        int edad = 35;
        boolean carnet = false;
        // carnet = !carnet; //-> Se niega lo que es.

        boolean candidatoValido = sueldo<30000 && edad<40 && carnet;
        System.out.println("\n¿El candidato es válido? " + candidatoValido);

        candidatoValido = sueldo<19000 || edad<40 || carnet;
        System.out.println("¿El candidato es válido? " + candidatoValido);

        candidatoValido = sueldo<19000 || edad<40 || carnet;
        System.out.println("¿El candidato es válido? " + candidatoValido);
    }

    public void evaluarCandidato(double sueldo, int edad, boolean conducir, String nombre)
    {
        boolean resultado = sueldo<20000 && edad<40 && conducir;
        System.out.println("\nBienvenido Candidato " + nombre);
        System.out.println("La evaluación del Candidato es -> " + resultado);
    }

    public void cambioTipos()
    {
        double numeroDecimal = 5.98;
        int numeroEntero = 7;
        System.out.println((int)numeroDecimal); //

        String palabra = "12";
        int numeroPalabra = Integer.parseInt(palabra); // a Esto se le llama Parseo (cambios de forma de tipo forzados, pueden fallar o no)
        System.out.println(numeroPalabra + 10);
    /*
        String palabraBool = "si";
        boolean palabraBoolean = Boolean.parseBoolean(palabraBool);
        System.out.println(palabraBoolean);
     */
        int numeroEvaluar =12345;
        String numeroEvaluarStr = String.valueOf(numeroEvaluar); // cuando un valor se pasa a un String es un value

    }
}
