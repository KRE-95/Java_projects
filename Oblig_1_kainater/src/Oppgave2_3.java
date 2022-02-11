public class Oppgave2_3 {
    public static void main(String[] args) {

        System.out.println("_______ Assignment 2.3 b and kinda a _______" + "\n");


        System.out.println("------ Fact about Mars ------");
        // create a object and call the class  Planet then give value, without changing the code - inncapsule.
        Planet mars = new Planet("Mars",3889, 69E23);
        System.out.println("\n" + mars);

        // In the assigment is written "objekter i flertall" then I take one more planet

        System.out.println( "\n" + "------ Fact about our planet, Earth ------");
        Planet earth = new Planet("Earth",6371,5.92E24);
        System.out.println("\n"+ earth);

        // use the Tostring with override method, in the class Planet



    }


}
