// olyan osztály amely minden metódusa abstract
interface Dolgozo {       
    void dolgozik();
    void pihen();
}


class Lapatos implements Dolgozo {

    @Override
    public void dolgozik() {
        System.out.println("lapatos dolgozik");

    }

    @Override
    public void pihen() {
        System.out.println("lapatos pihen");
    }

}



public class App {
    public static void main(String[] args) throws Exception {
        Dolgozo dolgozo = new Dolgozo() {
            
        };
    }
}
