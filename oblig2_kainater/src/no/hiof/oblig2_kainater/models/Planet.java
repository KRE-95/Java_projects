package no.hiof.oblig2_kainater.models;

public class Planet {
    // hentet fra oblig 1
    //  Do into private so we can use them in incapsule methode, but also get a clean code also reuseable code.
    private String name;
    private double masse;
    private double radius;

    // relevant for oppgave 2.4

    private static  final double MJUP = 1.898E27;
    private static  final double RJUP = 71493;
    private static  final double Gravity = 0.00000000006674;


    // Java will understand esaier that we are calling opon those by saying this.
    public  Planet(String name,double radius,double masse){
        this.name = name;
        this.radius = radius;
        this.masse = masse;
    }
    // Sense we have the above into private,we have to make them public, when the methode is called in 2_3
    // set into Void - with no value aka no return value
    public void Masse (double Masse) {masse= Masse;}
    public void Radius (double Radius) {radius = Radius;}
    public void Name (String Name) {name = Name;}



    @Override
    public String toString() {
        return "Planeten " + this.name + " har en radius" + " på " + this.radius + " km og en masse" + " " + this.masse + " kg.";

    }

    // as the report said, didnt take with get and set , so little rechange of the code.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // relevant 2.4
    public double getMjup(){
        double massInMjup = this.masse / MJUP;
        return massInMjup;
    }

    // 2.5 - converted
    public double getRjup() {return  this.radius /RJUP;}

    public double _SurfaceGravity(){
        double _RadiusMeter = this.radius * 1000;
        return (Gravity * this.masse)/ Math.pow(_RadiusMeter,2);
    }

}
