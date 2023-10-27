package questaoUm;

public class Car extends Vehicle {
    private String transmission;

    public Car(String rn, String transmission) {
        super(rn);
        this.transmission = transmission;
    }

    public String gettransmission() {
        return transmission;
    }

    public void settransmission(String transmission) {
        this.transmission = transmission;

    }

    public String getrn() {
        return rn;
    }

    public void setrn(String rn) {
        this.rn = rn;
    }

}