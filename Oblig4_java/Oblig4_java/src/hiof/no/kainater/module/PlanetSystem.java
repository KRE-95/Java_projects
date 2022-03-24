package hiof.no.kainater.module;
import java.util.ArrayList;
import java.util.Collection;

public  class PlanetSystem implements Comparable <PlanetSystem> {
    private String name;
    private Star centerStar;
   private ArrayList <Planet> planets = new ArrayList<>();

    // konstuktør
    public PlanetSystem(String name, Star centerStar) {
        this.name = name;
        this.centerStar = centerStar;
        // removes planets
    }

    // create compare methode - generate auto
    @Override
    public int compareTo(PlanetSystem planetSystem) {
        if (planets.size() == planetSystem.getPlanets().size()){ // lik
            return 0;
        }
        else if (planets.size() > planetSystem.getPlanets().size()){ // størst
            return 1;
        }
        else {
            return -1; // hvis mindre enn retuner negativ.
        }
    }
    // ble brukt for å teste compare fungerte.
    public Planet getPlanet(String name){
        for (Planet ad_planet : planets){
            if (ad_planet.getName().equalsIgnoreCase(name)){
                return ad_planet;
            }
        }
        return null;
    }
    // brukt i main
    public void add_Planet(Planet ad_planet){
       planets.add(ad_planet);
    }

    ///////////////////////// IKKE ENDRING - gjenbrukt kode ////////////////////////////////////////

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

    public Planet findSmallestPlanet(){
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


////  IKKE ENDRING //////////////////////////////////////////////////////////
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

    public ArrayList<Planet> getPlanets(){
        return new ArrayList<>(planets);
    }

    @Override
    public String toString( ) {
        return name + "," + "size: " + planets.size() + ", centerstar: " + centerStar.getName();
    }



}

