import java.util.Formatter;

public class Ravenclaw extends Hogwarts{

    private int intelligence, wisdom, wit, creativity;

    public Ravenclaw(String name, int intelligence, int wisdom, int wit, int creativity, int magicPoints, int transgressionDistance){
        super(name, magicPoints, transgressionDistance);
        if(intelligence >= 0 && intelligence <= 100 && wisdom >= 0 && wisdom <= 100 && wit >= 0 && wit <= 100
                && creativity >= 0 && creativity <= 100){
            this.intelligence = intelligence;
            this.wisdom = wisdom;
            this.wit = wit;
            this.creativity = creativity;
        } else {
            throw new IllegalArgumentException("Wrong Ravenclaw Class constructor arguments");
        }
    }

    public int getIntelligence(){ return intelligence; }
    public int getWisdom(){ return wisdom; }
    public int getWit(){return wit; }
    public int getCreativity(){ return creativity; }

    public String toString(){
        Formatter f = new Formatter();
        f.format("%-20s- ", "Ravenclaw student");
        String str = f.toString() + super.toString();
        f = new Formatter();
        f.format("; Intelligence: %3d; Wisdom: %3d; Wit: %3d; Creativity: %3d", intelligence, wisdom, wit, creativity);
        return str + f.toString();
    }

    public int academicPerformance(){
        return intelligence + wisdom + wit + creativity;
    }

}
