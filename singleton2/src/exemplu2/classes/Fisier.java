package exemplu2.classes;

public class Fisier {
    private int idFisier;
    private String length;
    private String pathFisier;

    //instanta de tipul clasei
    private static Fisier instanta = null;

    private Fisier(int idFisier, String length, String pathFisier) {
        this.idFisier = idFisier;
        this.length = length;
        this.pathFisier = pathFisier;
    }

    public static synchronized Fisier getInstance(int idFisier, String length, String pathFisier){
        if(instanta ==null){
            instanta = new Fisier(idFisier, length, pathFisier);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fisiser{");
        sb.append("idFisier=").append(idFisier);
        sb.append(", length='").append(length).append('\'');
        sb.append(", pathFisier='").append(pathFisier).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

