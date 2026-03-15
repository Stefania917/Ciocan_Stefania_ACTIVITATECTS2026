package classes;


public class Masina extends AVehicul implements IVehicul{

    private String model;
    private String culoare;

    public Masina(int anFabricare, String marca, int vitezaCurent, String model, String culoare) {
        super(anFabricare, marca, vitezaCurent);
        this.model = model;
        this.culoare = culoare;
    }


    @Override
    public void accelereaza(int valoare) {
        vitezaCurent+=valoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
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
        System.out.println("Masina cu modelul "+this.model+" a pornit");
    }

    @Override
    public void opreste() {
        System.out.println("Masina cu modelul "+this.model+" a oprit");
    }

    public void vopsesteMasina(IVehicul masina,String culoare){
        ((Masina)masina).culoare = culoare;
    }


}
