package hiof.no.kainater.module;

public abstract class CelestialBody implements Comparable <CelestialBody> {  // abs for 2.5 a
    // abstrahere fra planet og star  aka. felles
    private String name;
    private double radius;
    private double masse;
    // konstant for gravity
    private static final  double _GRAVITYCONST = 6.67408E-11;


    public CelestialBody(String name, double radius, double masse) {
        this.name = name;
        this.radius = radius;
        this.masse = masse;
    }

    // interface - forskjell mellom planetsystem ( size) her er det masse.

    @Override
    public int compareTo (CelestialBody celestialBody) {
        if (masse == celestialBody.getMasse()){  // lik
            return 0;
        }
        else if (masse > celestialBody.getMasse()){ // størst
            return 1;
        }
        else {
            return -1; // minst
        }
    }








    // get and set


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        this.masse = masse;

    }
    public double getGravityconst(){
        return _GRAVITYCONST;
    }

    // 2.5 abstract metoder
    public abstract double getRadiusInKm();
    public abstract double getMassInKg();
    // får errror om override på string
    public abstract String toString();



    // abs
}
