import java.util.Formatter;

public class Slytherin extends Hogwarts{

    int cunning, determination, ambition, resourcefulness, lustForPower;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness,
                     int lustForPower, int magicPoints, int transgressionDistance){
        super(name, magicPoints, transgressionDistance);
        if(cunning >= 0 && cunning <= 100 && determination >= 0 && determination <= 100
                && ambition >= 0 && ambition <= 100 && resourcefulness >= 0 && resourcefulness <= 100
                && lustForPower >= 0 && lustForPower <= 100){
            this.cunning = cunning;
            this.determination = determination;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.lustForPower = lustForPower;
        } else {
            throw new IllegalArgumentException("Wrong Slytherin Class constructor arguments");
        }
    }

    public int getCunning(){ return cunning; }
    public int getDetermination(){ return determination; }
    public int getAmbition(){return ambition; }
    public int getResourcefulness(){ return resourcefulness; }
    public int getLustForPower(){ return lustForPower; }


    public String toString(){
        Formatter f = new Formatter();
        f.format("%-20s- ", "Slytherin student");
        String str = f.toString() + super.toString();
        f = new Formatter();
        f.format("; Cunning: %3d; Determination: %3d; Ambition: %3d; Resourcefulness: %3d; Lust for Power: %3d",
                cunning, determination, ambition, resourcefulness, lustForPower);
        return str + f.toString();
    }

    public int academicPerformance(){
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

}
