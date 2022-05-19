import java.util.Formatter;

public class Gryffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int nobility, int honor, int courage, int magicPoints, int transgressionDistance){
        super(name, magicPoints, transgressionDistance);
        if(nobility >= 0 && nobility <= 100 && honor >= 0 && honor <= 100 && courage >= 0 && courage <= 100){
            this.nobility = nobility;
            this.honor = honor;
            this.courage = courage;
        } else {
            throw new IllegalArgumentException("Wrong Gryffindor Class constructor arguments");
        }
    }

    public int getNobility(){ return nobility; }
    public int getHonor(){ return honor; }
    public int getCourage(){return courage; }

    public String toString(){
        Formatter f = new Formatter();
        f.format("%-20s- ", "Gryffindor student");
        String str = f.toString() + super.toString();
        f = new Formatter();
        f.format("; Nobility: %3d; Honor: %3d; Courage: %3d", nobility, honor, courage);
        return str + f.toString();
    }

    public int academicPerformance(){
        return nobility + honor + courage;
    }

}
