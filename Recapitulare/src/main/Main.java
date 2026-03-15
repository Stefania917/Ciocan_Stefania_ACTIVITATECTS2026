package main;

import classes.AVehicul;
import classes.IVehicul;
import classes.Masina;
import classes.Motocicleta;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        IVehicul masina1 = new Masina(2012, "Audi", 70, "A4", "rosu");
        IVehicul moto1 = new Motocicleta(2019, "Harley", 120, "Nume1");

        masina1.afisare();
        masina1.opreste();
        moto1.afisare();
        ((AVehicul) moto1).accelereaza(30);
        System.out.println(((AVehicul) moto1).getVitezaCurent());

        IVehicul masina2 = new Masina(2009, "Logan", 40, "Sandero", "alb");
        IVehicul moto2 = new Motocicleta(2023, "Honda", 89, "Nume2");

        System.out.println("------------------Array-------------------");

        IVehicul[] vectorVehicule = new IVehicul[3];
        vectorVehicule[0] = masina1;
        vectorVehicule[1] = masina2;
        vectorVehicule[2] = moto1;

        for (int i = 0; i < 3; i++) {
            System.out.println(vectorVehicule[i]);
        }

        for (IVehicul vehicul : vectorVehicule) {
            vehicul.afisare();
        }


        System.out.println("------------------LIST------------------");

        List<IVehicul> listaVehicule = new ArrayList<>();

        listaVehicule.add(masina1);
        listaVehicule.add(masina2);
        listaVehicule.add(moto1);
        listaVehicule.add(moto2);

        for (IVehicul vehicul : listaVehicule) {
            vehicul.opreste();
        }

        listaVehicule.remove(moto1);
        System.out.println("/n");

        for (IVehicul vehicul : listaVehicule) {
            vehicul.opreste();
        }

        int a = listaVehicule.size();
        System.out.println(a);

        System.out.println(listaVehicule.get(0));

        System.out.println("------------------MAP-----------------");
        Map<Integer, IVehicul> mapVehicule = new HashMap<>();
        mapVehicule.put(1, masina1);
        mapVehicule.put(2, masina2);
        mapVehicule.put(3, moto1);
        mapVehicule.put(4, moto2);

        for (Integer key : mapVehicule.keySet()) {
            System.out.println(mapVehicule.get(key));
        }

        System.out.println();

        for (Map.Entry<Integer, IVehicul> setVehicul : mapVehicule.entrySet()) {
            System.out.println(setVehicul.getValue());
        }

        mapVehicule.remove(1);

        if (mapVehicule.containsKey(2)) {
            mapVehicule.put(2, new Masina(2014, "tesla", 40, "model1", "culoare"));

        }

        mapVehicule.get(2).afisare();
    }
}