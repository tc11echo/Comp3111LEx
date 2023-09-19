package Lab2c;

interface Chargeable{
    public void charge();
}

public class Charger {
    public void charger(Chargeable c){
        c.charge();
    }
}
