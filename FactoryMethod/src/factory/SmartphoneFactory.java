package factory;

import dispozitive.Dispozitiv;
import dispozitive.Smartphone;

public class SmartphoneFactory implements FabricaAbstracta {
    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Smartphone(nivelBaterie);
    }
}

