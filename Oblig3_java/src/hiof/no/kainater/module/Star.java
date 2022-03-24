package hiof.no.kainater.module;


    public class Star extends CelestialBody {
        // som skiller seg
        private int effectiveTemp;
        private static  final double MSUN = 695700;
        private static  final double RSUN = 1.98892E30;



        // konstruktør + super

        public Star(String name, double radius, double masse, int effectiveTemp) {
            super(name,radius,masse);
            this.effectiveTemp = effectiveTemp;
        }

        public  double getRadiusInKm() {              // opg.2
            return super.getRadius() * RSUN;
        }
        public  double getMassInKg(){
            return super.getMasse() * MSUN;

        }

        public double _SurfaceGravity() {
            return (super.getGravityconst() * getMassInKg()) / Math.pow(getRadiusInKm() * 1000, 2);

        }


        public int getEffectiveTemp() {
            return effectiveTemp;
        }

        public void setEffectiveTemp(int effectiveTemp) {
            this.effectiveTemp = effectiveTemp;
        }

        // oppgave 2.3
        @Override
        public String toString(){
            return "Star: " + super.getName()+ "\n" + "Mass of: " + super.getMasse() +" MSUN \n"+ "Radius: " + super.getRadius() + " RSUN \n" + "Temp: " + effectiveTemp + " C ";
        }





    }


