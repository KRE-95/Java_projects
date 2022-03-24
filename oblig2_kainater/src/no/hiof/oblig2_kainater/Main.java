package no.hiof.oblig2_kainater;
import no.hiof.oblig2_kainater.models.Planet;
import no.hiof.oblig2_kainater.models.PlanetSystem;
import no.hiof.oblig2_kainater.models.Star;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Star sun = new Star("Sun",1.0,1.0,5777);
        System.out.println("***** overide tostring  **** ");
        System.out.println(sun);
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);

        // instanisere en Arraylist - planets
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        PlanetSystem solarSystem = new PlanetSystem("Solar system",sun,planets); // må bli instansier for å hente planetnene.

        // oppgave 2.4 Radius i km og masse i kg  for "Saturn".
        //Radius i km og masse i kg og for vår stjerne "Sun".
        System.out.println();
        System.out.println("Masse for Saturn: " +saturn.getMjup() + " Mjup.");
        System.out.println("Radius for Saturn: " +saturn.getRjup() + " Rjup.");
        System.out.println();
        System.out.println("Masse for Sun: " +sun.getMjup() + " Mjup.");
        System.out.println("Radius for Sun: " +sun.getRjup() + " Rjup.");
       // KOMMENTAR: jeg er ikke helt sikker om jeg har gjort det riktig - tolkning
        System.out.println();

        // oppgave 2.5 Surface gravity
        System.out.println("Surface gravity til planeten Neptune : " + neptune._SurfaceGravity() + "g. ");

        // oppgave 2.6 - bonusoppgave? ( jeg hadde strevet med den før det ble om til bonus )

        System.out.println(" Den største planten : " + solarSystem.findLargestPlanet().getName());
        System.out.println(" Den minste planten  : " + solarSystem.findSmallestPlanet().getName());







    }
}
