package factory;


import dispozitive.Dispozitiv;

public interface FabricaAbstracta {
    Dispozitiv creareDispozitiv(int nivelBaterie);
}
