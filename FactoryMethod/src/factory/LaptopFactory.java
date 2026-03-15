package factory;

import dispozitive.Dispozitiv;
import dispozitive.Laptop;

public class LaptopFactory implements  FabricaAbstracta{
    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Laptop(nivelBaterie);
    }
}

