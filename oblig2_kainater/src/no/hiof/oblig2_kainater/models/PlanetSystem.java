package no.hiof.oblig2_kainater.models;
import java.util.ArrayList;

public class PlanetSystem {
    private String name;
    // 2.2
    private Star centerStar ;
    //planet i lista Planet
    private ArrayList<Planet>planets;

    // konstuktør
public PlanetSystem(String name, Star centerStar,ArrayList<Planet>planets){
    this.name = name;
    this.centerStar = centerStar;
    this.planets = planets;
}
   // utskrift for 2.3
    @Override
    public String toString(){
        return "Planetsystem" + "  " + this.name + " har en senterstjerne kalt "+ this.centerStar.getName() + "  og " + count_Planets()
                + planets;

    }

    public  int count_Planets(){
    return this.planets.size();
   }

    /**
     * Metode for å finne største planeten , sammenligne radius fra arraylisten
     * Dersom en har størst radius er det svaret, hvis to like sammenlignes de etter masse .
     */

    public Planet findLargestPlanet(){
        Planet l_Planet = planets.get(0);
         for (Planet p:planets){
             if(p.getRadius() > l_Planet.getRadius())
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
        for (Planet p:planets){
            if(p.getRadius() > s_Planet.getRadius())
                s_Planet = p;
            else if (p.getRadius() == s_Planet.getRadius())
                if (p.getMasse() > s_Planet.getMasse())
                    s_Planet = p;
        }
        return s_Planet;
    }









    // get and set for name and center: 2.1


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

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }



}
