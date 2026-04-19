package spital;

public class PersonalFactory {

    public PersonalSpital createPersonal(TipPersonal tip, String nume) {
        switch (tip) {
            case BRANCARDIER:
                return new Brancardier(nume);
            case ASISTENT:
                return new Asistent(nume);
            case MEDIC:
                return new Medic(nume);
            default:
                throw new IllegalArgumentException("Tip necunoscut: " + tip);
        }
    }
}