package hiof.no.kainater;

import hiof.no.kainater.module.Planet;
import hiof.no.kainater.module.PlanetSystem;
import hiof.no.kainater.module.Star;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Star sun = new Star("Sun",1.0,1.0,5777);
        System.out.println("***** oppgave 2.4  **** ");
        System.out.println(sun);
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387,0.206,88,sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225,sun);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365,sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687,sun);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380,sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585,sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660,sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225,sun);

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

        //Radius i km og masse i kg og for vår stjerne "Sun".
        System.out.println();
        System.out.println("Masse for Saturn: " +saturn.getMassInKg() + " Mjup.");
        System.out.println("Radius for Saturn: " +saturn.getRadiusInKm() + " Rjup.");
        System.out.println();
        System.out.println("Masse for Sun: " +sun.getMassInKg() + " Mjup.");
        System.out.println("Radius for Sun: " +sun.getRadiusInKm() + " Rjup.");
        // KOMMENTAR: fikset , hadde dårlig bruk av formel inspirasjon fra løsning fra oblig 2
        System.out.println();

        //  Surface gravity
        System.out.println("Surface gravity til planeten Neptune : " + neptune._SurfaceGravity() + "g. ");

        // finner størrelse av planet

        System.out.println(" Den største planten : " + solarSystem.findLargestPlanet().getName());
        System.out.println(" Den minste planten  : " + solarSystem.findSmallestPlanet().getName());

        // 2.2 - hente planet med navn
        System.out.println();
        System.out.println(" Oppgaave 2.2 og 2.3 : ");
        System.out.println(PlanetSystem.PlanetByName("earth"));
        System.out.println();
        System.out.println("Oppgave 2.5 løst i NaturalSatelite og CelstialBody.java - Abstraksjon");

        System.out.println();
        System.out.println("oppgave 2.6 a og b" + "\n" +
                "r = avstand i AU" + "\n" +
                "a = semiMajorAxis" + "\n" +
                "e = eccentricity" + "\n" +
                "0 = theta aka vinkel "
                );
        System.out.println(" ");
        System.out.println(" Kempler formel : r = a(1-e²) / 1 eCos0 ");
        System.out.println();
        for (int i = 0; i<360; i+=90){
            System.out.println(String.format("Earth has distance of %.0f  Km ,the sun at %d degrees",
             earth.distanceToCentralBodyDegree(i),i));
        }
        System.out.println();
        System.out.println("oppgave 2.7 " + "\n" +
                "v = hastighet m/s" + "\n" +
                "G =  Gravitasjon" + "\n" +
                "M =  Massen kg" + "\n" +
                "r =  Avstanden i meter. "
        );
        System.out.println(" ");
        System.out.println(" Formel:  v = kvadratrot( GM / r )");
        System.out.println();
        for (int i = 0; i<180; i+=45) {
            System.out.println(String.format(" At distance  of %.0f  Km , Earth has velocity of %.2fkm/s",
                    earth.distanceToCentralBodyDegree(i), earth.orbitingVelocity(earth.distanceToCentralBodyDegree(i))));
        }
        System.out.println(" Får feil får ikke lik utskrift får null i km ");

    }

    // TODO: etter rettet, se hvordan foreleser har løst. ang, oppg 2.6 og 7
}

