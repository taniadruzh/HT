package ht12_13_02_18.t1;

public class Seasons {
    public enum Season {
        WINTER("Cold season"),
        SPRING("Cool season"),
        SUMMER("Hot season"),
        FALL("Cool season");

        private String description;

        private Season(String description) {
            this.description = description;
        }

        public String getDescription() {return description;}
    };

    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s + ": " + s.getDescription());
    }
}
