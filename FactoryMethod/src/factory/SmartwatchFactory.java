package factory;


import dispozitive.Dispozitiv;
import dispozitive.Smartwatch;

public class SmartwatchFactory implements FabricaAbstracta{

    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Smartwatch(nivelBaterie);
    }
}

