package classes;


public class Motocicleta extends AVehicul implements IVehicul {

    private String numeSofer;


    public Motocicleta(int anFabricare, String marca, int vitezaCurent, String numeSofer) {
        super(anFabricare, marca, vitezaCurent);
        this.numeSofer = numeSofer;
    }

    @Override
    public void accelereaza(int valoare) {
        vitezaCurent+=valoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motocicleta{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", anFabricare=").append(anFabricare);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", vitezaCurent=").append(vitezaCurent);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisare() {
        System.out.println(this.toString());
    }

    @Override
    public void porneste() {
        System.out.println("Moto cu soferul "+this.numeSofer+" a pornit");
    }

    @Override
    public void opreste() {
        System.out.println("Moto cu soferul "+this.numeSofer+" a oprit");
    }
}

