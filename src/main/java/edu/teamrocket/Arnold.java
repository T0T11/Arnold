package edu.teamrocket;
import java.lang.Enum.EnumDesc;
import edu.teamrocket.Planetas;



public class Arnold {

    private double peso;

    public Arnold(double peso) {
        this.peso = peso;
    }

    public void Ejecucion(Planetas planetaElegido) {

        System.out.printf("Your weight on %s is %.2f N%n",
                planetaElegido.name(),
                planetaElegido.pesoSuperficie(peso));

        System.out.println("\nYour weight on all planets:");
        for (Planetas p : Planetas.values()) {
            System.out.printf("Your weight on %s is %.2f N%n",
                    p.name(), p.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the terrestrial planets:");
        for (Planetas p : Planetas.getPlanetasTerrestres()) {
            System.out.printf("Your weight on %s is %.2f N%n",
                    p.name(), p.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight on the ice giants:");
        for (Planetas p : Planetas.getPlanetasHelados()) {
            System.out.printf("Your weight on %s is %.2f N%n",
                    p.name(), p.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight on the gas giants:");
        for (Planetas p : Planetas.getPlanetasGaseosos()) {
            System.out.printf("Your weight on %s is %.2f N%n",
                    p.name(), p.pesoSuperficie(peso));
        }
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Uso: java Arnold <peso_en_kg> <PLANETA>");
            return;
        }

        double peso = Double.parseDouble(args[0]);
        String planetaStr = args[1].toUpperCase(); /* esto se hace debido a que el enum de planetas estan en mayuscul y lo guardo en un string */

        Planetas planeta = Planetas.valueOf(planetaStr);  /*hago una variable planeta que se guarda en el enum y guardo el valueof del string en mayusculas*/

        Arnold arnold = new Arnold(peso);
        arnold.Ejecucion(planeta);
    }
}
