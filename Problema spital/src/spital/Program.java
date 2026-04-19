package spital;

public class Program {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient.PacientBuilder("Andrei").cuPatRabatabil().cuMicDejun().build();
        Pacient pacient2 = new Pacient.PacientBuilder("Ioana").cuPapuci().cuHalat().build();
        Pacient pacient3 = new Pacient.PacientBuilder("Mihai").build(); // fără extra

        pacient1.descriere();
        System.out.println();
        pacient2.descriere();
        System.out.println();
        pacient3.descriere();

        PersonalFactory factory = new PersonalFactory();

        PersonalSpital p1 = factory.createPersonal(TipPersonal.MEDIC, "Dr. Popescu");
        PersonalSpital p2 = factory.createPersonal(TipPersonal.ASISTENT, "Maria");
        PersonalSpital p3 = factory.createPersonal(TipPersonal.BRANCARDIER, "Ion");

        p1.descriere();
        p2.descriere();
        p3.descriere();
    }


}
