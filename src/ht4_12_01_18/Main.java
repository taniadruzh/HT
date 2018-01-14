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
        int n1 = 0;
        Student [] stA = new Student[n];
        for (int i = 0; i < n; i++){
            for (int j = n1; j < studArr.length; j++){
                if (studArr[j].getAge() < 12) {
                    stA[i] = studArr[j];
                    n1 = j + 1;
                    break;
                }
            }
        }
        ClassRoom clA = new ClassRoom("A",12,stA);

        int k = 0;
        if (countB < 15) {
            k = countB;
        }
        else {
            k = 15;
        }
        Student [] stB = new Student[k];
        int k1 = 0;
        for (int i = 0; i < k; i++){
            for (int j = k1; j < studArr.length; j++){
                if (studArr[j].getAge() >= 12) {
                    stB[i] = studArr[j];
                    k1 = j + 1;
                    break;
                }
            }
        }
        ClassRoom clB = new ClassRoom("B",15,stB);

        System.out.println("----------ALL----------");
        for (Student student : studArr) {
            System.out.println(student.getName() +" "+ student.getAge());
        }

        System.out.println("----------A----------");
        for (Student student : stA) {
            System.out.println(student.getName() +" "+ student.getAge());
        }

        System.out.println("----------B----------");
        for (Student student : stB) {
            System.out.println(student.getName() +" "+ student.getAge());
        }

        int countNEnA = 0;
        System.out.println("-------Not enough A---------");
        for (int j = n1; j < studArr.length; j++){
            if (studArr[j].getAge() < 12) {
                System.out.println(studArr[j].getName() +" "+ studArr[j].getAge());
                countNEnA ++;
            }
        }
        System.out.println("Total not in A: " + countNEnA);

        int countNEnB = 0;
        System.out.println("-------Not enough B---------");
        for (int j = k1; j < studArr.length; j++){
            if (studArr[j].getAge() >= 12) {
                System.out.println(studArr[j].getName() +" "+ studArr[j].getAge());
                countNEnB ++;
            }
        }
        System.out.println("Total not in B: " + countNEnB);
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Count students in A class is " + clA.getClassCount());
        System.out.println("----------B----------");
        System.out.println("Count students in B class is " + clB.getClassCount());
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Students list in A class is: ");
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Students list in B class is: ");
        clB.getClassList();
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Students list in A class is: ");
        clA.getShortClassList();
        System.out.println("----------B----------");
        System.out.println("Students list in B class is: ");
        clB.getShortClassList();

        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Sorted students list in A class is: ");
        clA.ageSort();
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Sorted students list in B class is: ");
        clB.ageSort();
        clB.getClassList();

        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Sorted rev students list in A class is: ");
        clA.ageRevSort();
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Sorted rev students list in B class is: ");
        clB.ageRevSort();
        clB.getClassList();

        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Sorted name students list in A class is: ");
        clA.nameSort();
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Sorted name students list in B class is: ");
        clB.nameSort();
        clB.getClassList();


        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Sorted rev name students list in A class is: ");
        clA.nameRevSort();
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Sorted rev name students list in B class is: ");
        clB.nameRevSort();
        clB.getClassList();

    }
}
