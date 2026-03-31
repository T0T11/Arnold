package edu.teamrocket;
import java.lang.Enum.EnumDesc;
import edu.teamrocket.Planetas;

public class Arnold {
    public  static double peso = 90;
      static  void  main( String[] args) {
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

}
