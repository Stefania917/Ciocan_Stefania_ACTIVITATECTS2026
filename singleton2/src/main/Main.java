package main;

import classes.Agentie;
import exemplu2.classes.Fisier;


public class Main {
    public static void main(String[] args) {

        Fisier fisiser1  = Fisier.getInstance(1,"400","path1/path1");
        System.out.println(fisiser1);

        Fisier fisiser2  = Fisier.getInstance(2,"600","path2/path2");
        System.out.println(fisiser2);

        //Agentie agentie1 = new Agentie();  --- nu merge pt ca este privat constructorul
        Agentie agentie1 = Agentie.getInstance("Paralele45",30);
        System.out.println(agentie1);

        Agentie agentie2 = Agentie.getInstance("Karapten",40);
        System.out.println(agentie2);
    }
}
