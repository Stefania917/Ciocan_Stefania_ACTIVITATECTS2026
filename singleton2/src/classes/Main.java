package exemplu2.main;

import exemplu2.classes.Fisier;

public class Main {
    public static void main(String[] args) {
        Fisier fisiser1  = Fisier.getInstance(1,"400","path1/path1");
        System.out.println(fisiser1);

        Fisier fisiser2  = Fisier.getInstance(2,"600","path2/path2");
        System.out.println(fisiser2);
    }
}



