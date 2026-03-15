package program;



import dispozitive.Dispozitiv;
import factory.FabricaAbstracta;
import factory.SmartphoneFactory;

public class Program {
    private static void printareDispozitiv(FabricaAbstracta fabrica, int nivelBaterie){
        Dispozitiv dispozitiv= fabrica.creareDispozitiv(nivelBaterie);
        System.out.println(dispozitiv.toString());
    }

    public static void main(String[] args) {
        printareDispozitiv(new SmartphoneFactory(),50);
    }
}

