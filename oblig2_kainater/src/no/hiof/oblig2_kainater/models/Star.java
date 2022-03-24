package no.hiof.oblig2_kainater.models;

public class Star extends Planet{
    // opprette effectiveTemp - nesten lik egenskap men ikke helt
    // dermed tar valg for at det arver egenskaper av planet og deretter legger en eget egenskap
    // slikt slipper redundans
    private int effectiveTemp;

    public Star (String name,
                 double masse,
                 double radius, int effectiveTemp) {
        super(name,masse,radius);
        // uavhengi av parameter

        this.effectiveTemp = effectiveTemp;

    }

    // innkapsling av nye var
    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    // oppgave 2.3
    @Override
    public String toString(){
        return "Star: " + getName()+ "\n" + "Mass of: " + getMasse() +" Kg \n"+ "Radius: " + getRadius() + " Km \n" + "Temp: " + effectiveTemp + " C ";
    }


}


