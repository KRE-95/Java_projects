package hiof.no.kainater.module;

public abstract class NaturalSatelite extends CelestialBody{ // legg merke til abs er før klasse eller blir det error 2.5
    // oppgave 2.4 a og b
    private double semiMajorAxis, eccentricity, orbitalPeriod;
    private CelestialBody celestialBody;

    // konsktuktør + main txt fil


    public NaturalSatelite(String name, double radius, double masse, double semiMajorAxis, double eccentricity,
                           double orbitalPeriod, CelestialBody celestialBody) {
        super(name, radius, masse);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.celestialBody = celestialBody;

    }
    // oppgave 2.6 a
    static  final double AU = 149_597_871;  // 1 AU gitt i Km
    static  final  double _GRAVITYCONST = 6.67408E-11;

    // a og b

    // ser ut som det skal konverte de radianerne også for at det skal funke

    public double distanceToCentralBodyRadianer(double radians){
        double _DistanceInAU = (semiMajorAxis * (1-Math.pow(eccentricity,2))) / (1 + eccentricity* Math.cos(radians));
        return  _DistanceInAU * _GRAVITYCONST;
    }

    public double distanceToCentralBodyDegree(double degrees){
        return distanceToCentralBodyRadianer(Math.toRadians(degrees)); // merke til radiner aka logikken
    }


// oppgave 2.7
    public double orbitingVelocity_M_s(double distance){  // m/s
        return Math.sqrt(((_GRAVITYCONST * getMasse()) / getRadius() * (distance)));
    }

    // konvertering
    public  double orbitingVelocity (double distance) {  // om til Km/s
        return orbitingVelocity_M_s(distance / 100_000_000);
    }





    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public CelestialBody getCelestialBody() {
        return celestialBody;
    }

    public void setCelestialBody(CelestialBody celestialBody) {
        this.celestialBody = celestialBody;
    }
}
