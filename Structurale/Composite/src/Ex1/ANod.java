package Ex1;


public abstract class ANod {
    //nod frunza
    public abstract String getDenumire();
    public abstract int getPret();

    //pentru toate nodurile -> implementare concreta pe nod frunza
    public String getInfo(){
        return this.getDenumire() + " " + this.getPret();
    }

    //metode specifice nodurilor structura ->implementare convenabila pentru nod frunza
    public void adaugaNod(Ex1.ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(Ex1.ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public Ex1.ANod getNod (int i){
        throw new UnsupportedOperationException();
    }
}
