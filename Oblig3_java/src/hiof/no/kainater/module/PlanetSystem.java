package hiof.no.kainater.module;
import java.util.ArrayList;

public class PlanetSystem {
    private String name;
    private Star centerStar;
    private static ArrayList<Planet> planets;

    // konstuktør
    public PlanetSystem(String name, Star centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }


    @Override
    public String toString() {
        return "Planetsystem" + "  " + this.name + " har en senterstjerne kalt " + this.centerStar.getName() + "  og " + count_Planets()
                + planets;

    }

    public int count_Planets() {
        return planets.size();
    }

    /**
     * Metode for å finne største planeten , sammenligne radius fra arraylisten
     * Dersom en har størst radius er det svaret, hvis to like sammenlignes de etter masse .
     */

    public Planet findLargestPlanet() {
        Planet l_Planet = planets.get(0);
        for (Planet p : planets) {
            if (p.getRadius() > l_Planet.getRadius())
                l_Planet = p;
            else if (p.getRadius() == l_Planet.getRadius())
                if (p.getMasse() > l_Planet.getMasse())
                    l_Planet = p;
        }
        return l_Planet;
    }

    /**
     * Metode for å finne minste planeten , sammenligne radius fra arraylisten
     * Dersom  radius er lik, sammenlignes de etter masse .
     */

    public Planet findSmallestPlanet() {
        Planet s_Planet = planets.get(0);
        for (Planet p : planets) {
            if (p.getRadius() > s_Planet.getRadius())
                s_Planet = p;
            else if (p.getRadius() == s_Planet.getRadius())
                if (p.getMasse() > s_Planet.getMasse())
                    s_Planet = p;
        }
        return s_Planet;
    }


    // lage metode som henter planet navn ved kall - 2.2

    public static Planet PlanetByName(String planet_Name) {
        Planet found = null;
        for (Planet planet : planets){
            if (planet.getName().equalsIgnoreCase(planet_Name)){
                found = planet;
            }
        }
        return found;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public static ArrayList<Planet> getPlanets() {
        return planets;
    }

    public static void setPlanets(ArrayList<Planet> planets) {
        PlanetSystem.planets = planets;
    }
}

