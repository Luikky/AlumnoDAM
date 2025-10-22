import java.sql.SQLOutput;

public class SentenciaIf
{
    public void examenAprobado(int nota)
    {
        System.out.println("Procedemos a comprobar si el examen está aprobado");
        System.out.println("La nota que vamos a evaluar es -> " + nota);
        if(nota>=5 )
        {
            System.out.println("¡El exámen está aprobado!");
        }
        else
        {
            System.out.println("¡El exámen está suspendido!");
        }
        System.out.println("La evaluación a TERMINADO");
        System.out.printf("Saliendo del Programa");
    }

    public void notaExamen(int nota)
    {
        // suspenso -> 0 - 4.99
        // aprobado -> 5 - 7.99
        // notable -> 8 - 8.99
        // sobrecialente -> 9 - 9.99
        // matricula de honor -> 10

        String restultadoExamen;
        System.out.println("\n----------------------------");

        if(nota>0 && nota<=10)
        {
            if (nota>=0 && nota<5)
            {
                //System.out.println("El Exámen está Suspenso");
                restultadoExamen = "SUSPENSO";
            } else if (nota<8)
            {
                //System.out.println("El Exámen está Aprobado");
                restultadoExamen = "APROBADO";
            }else if (nota <9)
            {
                //System.out.println("El Exámen es un Notable");
                restultadoExamen = "NOTABLE";
            } else if (nota<10)
            {
                //System.out.println("El Exámen es un Sobresaliente");
                restultadoExamen = "SOBRESALIENTE";
            }else
            {
                //System.out.println("El Exámen es una Matricula de Honor");
                restultadoExamen = "MATRICULA DE HONOR";
            }
        }else
        {
            //System.out.println("La Nota NO es Válida");
            restultadoExamen ="FUERA DE RANGO";
        }

        System.out.println(restultadoExamen);
    }
}
