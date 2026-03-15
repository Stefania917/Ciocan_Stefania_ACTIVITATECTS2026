package classes;


public class Agentie {
    private String denumire;
    private int nrAngajati;

    //instanta de tipul clasei
    // private static Agentie instanta = new Agentie(); //eager initializaton
    private static Agentie instanta = null;

    //constructorul PRIVAT
    private Agentie(String denumire, int nrAngajati) {
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
    }

    //metoda publica statica getInstance
    public static synchronized Agentie getInstance(String denumire, int nrAngajati){
        if(instanta==null){
            instanta = new Agentie(denumire,nrAngajati);
        }
        return instanta;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentie{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
