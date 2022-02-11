public  class MyWightConvertedToMoon {
    public static void main(String[] args) {
        // my wight , use double sense it is more used in practice in Java
        double wordlyWightInKg;  // Declared
        wordlyWightInKg = 53.00; // Give a value inside of intalized var.
        System.out.println(wordlyWightInKg +" KG");


       // Converting the KG to N = the wight On the moon
       double wightOnTheMoonInN;
       wightOnTheMoonInN = (wordlyWightInKg * (1.622/9.81)); // calc
       // output
        System.out.println("Your wight on the Moon : " + wightOnTheMoonInN + " N ");

      // I would also like to get them in float , then round with 2 decimal. prob too many digits in wight on the moon
  }


}