package restaurant.adapter;

public class SoftPrintareBucatarie {
    private String produs;

    public SoftPrintareBucatarie(String produs) {
        this.produs = produs;
    }

    public void printareFactura() {
        System.out.println("Factura printata pentru produsul din bucatarie: " + produs);
    }
}
