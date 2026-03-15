package program;



import dispozitive.Dispozitiv;
import factory.FabricaDispozitive;
import factory.TipDispozitiv;

public class Program {
    public static void main(String[] args) {
        FabricaDispozitive fabrica=FabricaDispozitive.getInstanta();
        Dispozitiv laptop=fabrica.getDispozitiv(TipDispozitiv.Laptop,86);
        Dispozitiv telefon=fabrica.getDispozitiv(TipDispozitiv.Smartphone,73);
        Dispozitiv ceas= fabrica.getDispozitiv(TipDispozitiv.Smartwatch,23);

        System.out.println(laptop.toString());
        System.out.println(telefon.toString());
        System.out.println(ceas.toString());


    }
}

