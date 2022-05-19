public class Main {
    public static void main(String[] args) {

        Hogwarts[] students = {
                new Gryffindor("Harry Potter", 5, 6, 4, 7, 12),
                new Gryffindor("Hermione Granger", 5, 5, 6, 6, 10),
                new Gryffindor("Ron Weasley", 3, 6, 5, 3, 7),
                new Slytherin("Draco Malfoy", 3, 7, 11, 5, 6, 6, 9),
                new Slytherin("Graham Montague", 2, 5, 7, 8, 5, 2, 5),
                new Slytherin("Gregory Goyle", 1, 3, 8, 5, 9, 2, 3),
                new Hufflepuff("Zacharias Smith", 5, 7, 9, 6, 9 ),
                new Hufflepuff("Cedric Diggory", 7, 9, 10, 10, 8),
                new Hufflepuff("Justin Finch-Fletchley", 5, 7, 8, 5, 7),
                new Ravenclaw("Cho Chang", 5, 4, 6, 9, 5, 11 ),
                new Ravenclaw("Padma Patil", 6, 5, 4, 10, 8, 13),
                new Ravenclaw("Marcus Belby", 4, 4, 3, 7, 10, 15)
        };

        for (Hogwarts student : students){
            System.out.println(student);
        }
        System.out.println();

        Hogwarts student1 = students[0], student2 = students[3];
        switch(student1.compareMagic(student2)){
            case 1:
                System.out.println("Student " + student1.getName() + " has more magic power than" +
                        " student " + student2.getName());
                break;
            case 0:
                System.out.println("Student " + student1.getName() + " has the same magic power than" +
                        " student " + student2.getName());
                break;
            case -1:
                System.out.println("Student " + student1.getName() + " has less magic power than" +
                        " student " + student2.getName());
        }

        student2 = students[1];
        switch(student1.compareAcademicPerformance(student2)){
            case 1:
                System.out.println("Student " + student1.getName() + " has better academic performance than " +
                        "student " + student2.getName());
                break;
            case 0:
                System.out.println("Student " + student1.getName() + " has the same academic performance than" +
                        " student " + student2.getName());
                break;
            case -1:
                System.out.println("Student " + student1.getName() + " has worse academic performance than" +
                        " student " + student2.getName());
                break;
            default:
                System.out.println("We are not able to compare academic performance of students " +
                        "from different houses");
        }

    }
}