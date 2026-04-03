package edu.teamrocket;
import java.lang.Enum.EnumDesc;
import edu.teamrocket.Planetas;

public class Arnold {
    private double peso ;
    private static Arnold instance; /* tiene que el constructor ser privado*/

    private Arnold(double peso) /* constructor privado*/ {
        this.peso = peso;
    }

    public static Arnold getInstance(double peso ){
        if (instance == null) {
            instance = new Arnold(peso);
        }
        return  instance; /*esto es el Singleton*/
    }

    public double getPeso() {
        return peso;
    }


    public void Ejecucion() {
          for (Planetas planetas : Planetas.values() ) {
              System.out.println("Your weight on %s is %f N%n",planetas.name(), planetas.pesoSuperficie(peso);}


          System.out.println("\nYour weight only on the terrestrial planets: ");
          for (Planetas planetas : Planetas.getPlanetasTerrestres()){ /* de la variable llamada planetas, sacada del Enum Planetas quiero que le apliques la funcion dicha de planetas */
              System.out.println("Your weight on %s is %f N%n", planetas.name(), planetas.pesoSuperficie(peso);
          }
          System.out.println("\n“your weight on the ice giants:");
          for (Planetas planetas : Planetas.getPlanetasHelados()) {
              System.out.println("Your weight on %s is %f N%n", planetas.name(), planetas.pesoSuperficie(peso);
          }

          System.out.println("\nYour weight only on the gas giant planets:");
          for (Planetas planetas : Planetas.getPlanetasGaseosos()){
              System.out.println("Your weight on %s is %f N%n", planetas.name(), planetas.pesoSuperficie(peso);
          }

     }

    public static void main(String[] args) {
        Arnold arnold = Arnold.getInstance(90); /*mi peso */
        arnold.Ejecucion();
    }

}
