package hiof.no.kainater;
import hiof.no.kainater.module.Planet;
import hiof.no.kainater.module.PlanetSystem;
import hiof.no.kainater.module.Star;
import hiof.no.kainater.tools.StarCSVFileHandler;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Star sun = new Star("Sun",1.0,1.0,5777);

        PlanetSystem solarSystem = new PlanetSystem("Solar system",sun);
         // oppgave 2.1
        solarSystem.add_Planet(new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387,0.206,88,sun));
        solarSystem.add_Planet(new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225,sun));
        solarSystem.add_Planet(new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365,sun));
        solarSystem.add_Planet(new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687,sun));
        solarSystem.add_Planet(new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380,sun));
        solarSystem.add_Planet(new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585,sun));
        solarSystem.add_Planet(new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660,sun));
        solarSystem.add_Planet(new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225,sun));


        /** Teste om compare fungerer uten sortering :
         *   Planet venus = solarSystem.getPlanet("Venus");
         *         Planet mars = solarSystem.getPlanet("Mars");
         *         Planet earth = solarSystem.getPlanet("Earth");
         *         Planet jupiter = solarSystem.getPlanet("Jupiter");
         *
         *         // test om compare fungerer - kommenter bort
         *         System.out.println(mars.compareTo(venus)); // output -1 Mars er minst, enn venus iht. masse og størrelse
         *         System.out.println(jupiter.compareTo(earth)); // output 1 -> jupiter er større enn Earth iht. masse og størrelse.
         *
         * */


        ArrayList <Planet> planets = solarSystem.getPlanets();
        // Med sortering :
        Collections.sort(planets);{
            for (Planet planet : planets){
                System.out.println();
                System.out.println(" List of planet that are compared too eachother and sorted:");
                System.out.println( "\n" + planet);
            }
        }
        // oppgave 2.2
        System.out.println();
        System.out.println("******* lese og skrive for filhåndtering CSV  - Interface og klasse **********");
        System.out.println();


        ArrayList<Star> s = new ArrayList<>(); // stars Arraylist
        s.add(new Star("Sun", 1.0,1.0,5777.0));
        s.add(new Star("MU Cas", 4.192, 4.657, 14750.0));  // tall fra star.text
        s.add(new Star("V69-47", 1.316, 0.876, 5945.0));
        s.add(new Star("YZ Cas", 2.547, 2.308, 9200.0));
        s.add(new Star("NGC188", 1.425, 1.102, 5900.0));
        s.add(new Star("zet Phe", 2.853, 3.922, 14550.0));
        StarCSVFileHandler starFileHandler = new StarCSVFileHandler();

        starFileHandler.writeObjectToFile(s, new File("test.csv"));

        ArrayList<Star> starsFileHandler = starFileHandler.readObjectsFromFile(new File("test.csv"));
        for (Star current : starsFileHandler){
            System.out.println(current);
        }


    }


}

