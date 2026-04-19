package restaurant.abstractfactory;

public class Clatite extends FelMancare {

    public Clatite() {
        super("Clatite");
    }

    @Override
    public void afisare() {
        System.out.println("Preparat: " + denumire);
    }
}
