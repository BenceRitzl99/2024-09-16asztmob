
abstract class Dolgozo {

    abstract void dolgozik();
    abstract void eszik();

    void pihen() {
        System.out.println("Pihen!"); // ha nem abstract akkor egyből meg kell valósítani 
    }

    
}

class Lapatos extends Dolgozo {
    void dolgozik() {
        System.out.println("Lapátos dolgozik!");
    }
    void eszik() {
        System.out.println("Lapátos eszik!");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // hibás, nem példányosítható
        // Dolgozo dolgozo = new Dolgozo() 

        Dolgozo dolgozo = new Lapatos();
        dolgozo.dolgozik();
        dolgozo.pihen();
        dolgozo.pihen();
        dolgozo.pihen();
        dolgozo.pihen();
        dolgozo.pihen();
        dolgozo.pihen();
            
        
    }
}
