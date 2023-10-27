package questaoUm;

public class Truck extends Vehicle {
    private int mass;

    public Truck(String rn, int mass) {
        super(rn);
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getrn() {
        return rn;
    }

    public void setrn(String rn) {
        this.rn = rn;
    }

}
