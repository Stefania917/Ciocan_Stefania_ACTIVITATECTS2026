

public class Main {
    public static void main(String[] args) {

        System.out.println(" Simple Factory");
        restaurant.simplefactory.FabricaSupe fabricaSupe = new restaurant.simplefactory.FabricaSupe();
        restaurant.simplefactory.Supa supa = fabricaSupe.creareSupa(restaurant.simplefactory.TipSupa.CIUPERCI, 18);
        supa.afisare();

        System.out.println();
        System.out.println(" Builder");
        restaurant.builder.Rezervare rezervare = new restaurant.builder.Rezervare.RezervareBuilder("Popescu Ana")
                .setAsezareGeam(true)
                .setDecorareMasa(true)
                .build();
        rezervare.afisareRezervare();

        System.out.println();
        System.out.println(" Abstract Factory");
        restaurant.abstractfactory.FabricaAbstracta fabricaFeluri = new restaurant.abstractfactory.FabricaSupe();
        restaurant.abstractfactory.FelMancare fel1 = fabricaFeluri.creareFel("vita");
        fel1.afisare();
        restaurant.abstractfactory.FabricaAbstracta fabricaDesert = new restaurant.abstractfactory.FabricaDesert();
        restaurant.abstractfactory.FelMancare fel2 = fabricaDesert.creareFel("papanasi");
        fel2.afisare();

        System.out.println();
        System.out.println(" Prototype");
        restaurant.prototype.ContClient cont1 = new restaurant.prototype.ContClient("Ionescu Mihai", "0711111111", "mihai@gmail.com");
        restaurant.prototype.ContClient cont2 = (restaurant.prototype.ContClient) cont1.copiaza();
        cont2.afisare();

        System.out.println();
        System.out.println("Adapter");
        restaurant.adapter.SoftBar softBar = new restaurant.adapter.AdapterBarBucatarie(
                new restaurant.adapter.SoftPrintareBucatarie("Limonada"));
        softBar.printeaza();
    }
}