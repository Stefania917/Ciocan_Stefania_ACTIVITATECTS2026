//Să se dezvolte modulul care asigură crearea
//de obiecte de tipul pacient cu opțiuni extra.

package spital;

public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatInterior;

    private Pacient(PacientBuilder builder) {
        this.nume = builder.nume;
        this.patRabatabil = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
        this.papuciDeCamera = builder.papuciDeCamera;
        this.halatInterior = builder.halatInterior;
    }

    public void descriere() {
        System.out.println("Pacient: " + nume);
        System.out.println("   - Pat rabatabil: " + patRabatabil);
        System.out.println("   - Mic dejun inclus: " + micDejunInclus);
        System.out.println("   - Papuci de camera: " + papuciDeCamera);
        System.out.println("   - Halat interior: " + halatInterior);
    }

    public static class PacientBuilder {
        private String nume;
        private boolean patRabatabil = false;
        private boolean micDejunInclus = false;
        private boolean papuciDeCamera = false;
        private boolean halatInterior = false;

        public PacientBuilder(String nume) {
            this.nume = nume;
        }

        public PacientBuilder cuPatRabatabil() {
            this.patRabatabil = true;
            return this;
        }

        public PacientBuilder cuMicDejun() {
            this.micDejunInclus = true;
            return this;
        }

        public PacientBuilder cuPapuci() {
            this.papuciDeCamera = true;
            return this;
        }

        public PacientBuilder cuHalat() {
            this.halatInterior = true;
            return this;
        }

        public Pacient build() {
            return new Pacient(this);
        }
    }
}