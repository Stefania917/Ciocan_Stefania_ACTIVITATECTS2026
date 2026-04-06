public class Fabrica {
    public IPachetTuristic creazaPachet(TipPachet tip) throws Exception {
        switch (tip) {
            case trsp:
                return new PachetTransport();
            case cazare:
                return new PachetCazare();
            case cazareSiTrsp:
                return new PachetCazareTransport();
            case allInclusive:
                return new PachetAllInclusive();
            default:
                throw new Exception("nu e un tip valid");
        }
    }
}

