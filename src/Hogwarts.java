import java.util.Formatter;

public abstract class Hogwarts {
    private final String name;
    private final int magicPoints;
    private final int transgressionDistance;

    public Hogwarts(String name, int magicPoints, int transgressionDistance) {
        if(magicPoints >= 0 && magicPoints <= 100 && transgressionDistance >= 0 && transgressionDistance <= 100
                && name != null){
            this.name = name;
            this.magicPoints = magicPoints;
            this.transgressionDistance = transgressionDistance;
        } else {
            throw new IllegalArgumentException("Wrong Hogwarts Class constructor arguments");
        }
    }

    public String getName(){ return name; }
    public int getMagicPoints(){ return magicPoints; }
    public int getTransgressionDistance(){ return transgressionDistance; }

    public String toString(){
        Formatter f = new Formatter();
        f.format("Name: %23s; Magic Points: %3d; Transgression Distance: %3d", name, magicPoints, transgressionDistance);
        return f.toString();
    }

    public abstract int academicPerformance();

    public int compareAcademicPerformance(Hogwarts student){
        if(student == null) throw new IllegalArgumentException("Wrong Hogwarts Class " +
                "compareAcademicPerformance method argument");
        if(this.getClass() != student.getClass()){
            return -100;
        }
        if(this.academicPerformance() > student.academicPerformance()){
            return 1;
        } else if(this.academicPerformance() == student.academicPerformance()){
            return 0;
        } else {
            return -1;
        }
    }

    public int compareMagic(Hogwarts student){
        int index = this.magicPoints + this.transgressionDistance;
        if(student != null){
            int indexStudent = student.getMagicPoints() + student.getTransgressionDistance();
            if(index > indexStudent){
                return 1;
            } else if(index == indexStudent){
                return 0;
            } else {
                return -1;
            }
        } else {
            throw new IllegalArgumentException("Wrong Hogwarts Class compare method argument");
        }

    }
}
