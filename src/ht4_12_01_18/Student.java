package ht4_12_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private String name;
    private int age;

    public Student() {
        setName();
        setAge();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        String [] str = new String [20];
        str[0] = "Vasia";
        
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        int randomNum = ThreadLocalRandom.current().nextInt(7, 16 + 1) ;
        this.age = randomNum;
    }
}
