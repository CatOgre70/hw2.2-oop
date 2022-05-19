import java.util.Formatter;

public class Hufflepuff extends Hogwarts{

    private int hardWork, loyalty, honesty;

    public Hufflepuff(String name, int hardWork, int loyalty, int honesty, int magicPoints, int transgressionDistance){
        super(name, magicPoints, transgressionDistance);
        if(hardWork >= 0 && hardWork <= 100 && loyalty >= 0 && loyalty <= 100 && honesty >= 0 && honesty <= 100){
            this.hardWork = hardWork;
            this.loyalty = loyalty;
            this.honesty = honesty;
        } else {
            throw new IllegalArgumentException("Wrong Hufflepuff Class constructor arguments");
        }
    }

    public int getHardWork(){ return hardWork; }
    public int getLoyalty(){ return loyalty; }
    public int getHonesty(){return honesty; }

    public String toString(){
        Formatter f = new Formatter();
        f.format("%-20s- ", "Hufflepuff student");
        String str = f.toString() + super.toString();
        f = new Formatter();
        f.format("; Hard work: %3d; Loyalty: %3d; Honesty: %3d", hardWork, loyalty, honesty);
        return str + f.toString();
    }

    public int academicPerformance(){
        return hardWork + loyalty + honesty;
    }

}
