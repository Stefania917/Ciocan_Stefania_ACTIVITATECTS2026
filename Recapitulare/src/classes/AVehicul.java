package classes;

public abstract class AVehicul {
    protected int anFabricare;
    protected String marca;
    protected int vitezaCurent;

    public AVehicul(int anFabricare, String marca, int vitezaCurent) {
        this.anFabricare = anFabricare;
        this.marca = marca;
        this.vitezaCurent = vitezaCurent;
    }

    public int getAnFabricare() {
        return anFabricare;
    }

    public void setAnFabricare(int anFabricare) {
        this.anFabricare = anFabricare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVitezaCurent() {
        return vitezaCurent;
    }

    public void setVitezaCurent(int vitezaCurent) {
        this.vitezaCurent = vitezaCurent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AVehicul{");
        sb.append("anFabricare=").append(anFabricare);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", vitezaCurent=").append(vitezaCurent);
        sb.append('}');
        return sb.toString();
    }

    //metoda abstracta
    public abstract void accelereaza(int valoare);

    public int franeaza(int valoare){
        vitezaCurent -= valoare;
        return vitezaCurent;
    }


}

