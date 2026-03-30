package edu.teamrocket;

import java.util.EnumSet;

enum Planetas {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

     public static final double G = 6.67400e-11;
     private  double masa;
     private  double radio;


     private Planetas(double masa, double radio) {
         this.masa = masa;
         this.radio = radio;
     }

     public double getMasa() {
         return this.masa;
     }

     public double getRadio() {
         return this.radio;
     }

    public double gravedadSuperficie() {
        return G * this.masa / (this.radio * this.radio);
    }
     public double pesoSuperficie(double masaObjeto) {
         return masaObjeto * gravedadSuperficie();
     }

     public double miMasa(double peso){
          return peso / EARTH.gravedadSuperficie();
     }

    public static EnumSet<Planetas> getPlanetasTerrestres() {
        return EnumSet.of(MERCURY, MARS,VENUS,EARTH);
    }
    public static EnumSet<Planetas> getPlanetasGaseosos(){
         return EnumSet.of(JUPITER,SATURN);
    }

    public static EnumSet<Planetas> getPlanetasHelados(){
         return EnumSet.of(URANUS,NEPTUNE);
    }



}
