package hiof.no.kainater.module;

    public class Planet extends NaturalSatelite {

        // relevant for oppgave 2.4

        private static  final double MJUP = 1.898E27;
        private static  final double RJUP = 71493;
        private static  final double R_GRAVITY = 6371;
        private static  final  double M_GRAVITY = 5.792E24; // relevant for  2.2

        // må innstansiere de nye fra
        public Planet(String name, double radius, double masse, double semiMajorAxis, double eccentricity, double orbitalPeriod,
                      CelestialBody centralClestialalBody) {
            super(name, radius, masse, semiMajorAxis,eccentricity,orbitalPeriod,centralClestialalBody);
        }

// oppgave 2 endrer på formel ettersom jeg delte bytter fra getMjup til hva oppgaven spør + formel min var feil
        public double getRadiusInKm() {
            return super.getRadius() * RJUP;
        }

        public double getMassInKg(){
            return super.getMasse() * MJUP;
        }

        public double radiusInEarth(){
            return super.getRadius() / R_GRAVITY;
        }
        public double massInEarth( ) {
            return super.getMasse() / M_GRAVITY;
        }
        public double _SurfaceGravity(){
            return(super.getGravityconst()* getMassInKg()) / Math.pow(getRadiusInKm()*1000,2);

        }

        @Override
        public String toString() {
            return " Planet: " + super.getName() + "\n "  + "Radius: " + super.getRadius() + " " + "RJUP" + " \n "  +
                    "Mass: "  + super.getMasse() + " " + " MJUP.";
        }

    }


