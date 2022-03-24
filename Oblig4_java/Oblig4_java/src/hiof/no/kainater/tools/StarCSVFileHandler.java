package hiof.no.kainater.tools;

import hiof.no.kainater.interfaceses.ObjectFileHandler;
import hiof.no.kainater.module.Star;
import java.io.*;
import java.util.ArrayList;

public class StarCSVFileHandler implements ObjectFileHandler <ArrayList<Star>> {
    @Override
    public void writeObjectToFile(ArrayList<Star> s, File file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String writeString = "name,radius,masse,effectiveTemp\n";  // <- skapte mye error uten /n , kan ikke skrive + "\n"
            for (Star star : s){ // Star-objekter i s
                writeString += star.getName() + "," + star.getRadius() + "," + star.getMasse() + "," + star.getEffectiveTemp() + "\n";
            } bufferedWriter.write(writeString); // husk rekursiv
        } catch (IOException ioException) { // FileWriter
            System.err.println(ioException.getMessage());
        }

    }



    @Override
    public ArrayList<Star> readObjectsFromFile(File file) {
        ArrayList<Star> s = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String sentence;
            while ((sentence = bufferedReader.readLine()) !=null){
                if (!sentence.equalsIgnoreCase("name,radius,masse,effectiveTemp")){
                    String[] value = sentence.split(",");
                    // change the effectiveTemp to a Double. from int to double [3]
                    s.add(new Star(value[0], Double.parseDouble(value[1]), Double.parseDouble(value[2]), Double.parseDouble(value[3])));
                }
            }

        } catch (FileNotFoundException e) { // FileReader
            e.printStackTrace();
        } catch (IOException ex) { // runder av alle execption
            ex.printStackTrace();
        }
        return s;
    }

}





