package ht4_12_01_18;

public class Main {
    public static void main(String[] args) {
        Student [] studArr= new Student[40];
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < 40; i++) {
            Student stud = new Student();
            studArr[i] = stud;
            if (stud.getAge() <12 ) {
                countA ++;
            }
            else {
                countB ++;
            }
        }
        int n = 0;
        if (countA < 12) {
           n = countA;
        }
        else {
           n = 12;
        }
        Student [] stA = new Student[n];
        ClassRoom clA = new ClassRoom("A",12,stA);

        if (countB < 15) {
            n = countB;
        }
        else {
            n = 15;
        }
        Student [] stB = new Student[n];
        ClassRoom clB = new ClassRoom("B",15,stB);

        for (Student student : studArr) {
            System.out.println(student.getName() +" "+ student.getAge());
        }
    }
}
