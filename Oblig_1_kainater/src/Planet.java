public class Planet {
    //  Do into private so we can use them in incapsule methode, but also get a clean code also reuseable code.
    private String name;
    private double masse;
    private double radius;


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

    // now this would be found the methods witout any value inside of them. I am unsure if i am suppose to make
    // another class to check if it works , so I am just making a main bellow.

    public static void main(String[] args) {
        Planet mars = new Planet("Mars",3889,69E23);
       // System.out.println(mars);  // test if it works
        // The result is gibbrish then use of tostring will be handy instead of Planet@e9e54c2
    }

    // I am going to use Ovveride and tostring kinda Universial call after done b
    // Planeten Mars har en radius på 3389.5 km og en masse på 6.39E23 kg

    @Override
    public String toString() {
        return "Planeten  " + name + " har en radius" + " på " + radius + " km " + ", og en masse på " + masse + " kg.";

    }



}
