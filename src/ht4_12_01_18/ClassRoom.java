package ht4_12_01_18;

public class ClassRoom {
    private String classWord;
    private int classLimit;
    private Student[] studMass;

    public ClassRoom(String classWord, int classLimit, Student[] studMass) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studMass = studMass;
    }

    public int getClassCount() {
        return studMass.length;
    }

    public void getClassList(){
        for (Student mass : studMass) {
            System.out.println(mass.getName() + " " + mass.getAge());

        }
    }

    public void getShortClassList(){
        for (Student mass : studMass) {
            System.out.println(mass.getName());

        }
    }
}
